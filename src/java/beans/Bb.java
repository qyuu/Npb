/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import db.BallparkDb;
import db.ParkCapDb;
import entity.Ballpark;
import entity.BallparkId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author yuu
 */
@Named
@RequestScoped
public class Bb {
	private static Map<Integer, Integer> yearItems;
	private static Map<String, Ballpark> ballparkItems;
	
	private Integer year;
	private String name;
	private Integer cap;
	
	@EJB
	private BallparkDb db;
	@EJB
	private ParkCapDb db2;
	static{
		yearItems = new LinkedHashMap<>();
		for(int i=1980; i<2050; i++){
			yearItems.put(i, i);
		}
	}
	@PostConstruct
	public void init(){
		ballparkItems = new LinkedHashMap<>();
		
		List<Ballpark> l = getAll();
		for(Ballpark b : l){
			ballparkItems.put(b.getId().getFyear()+b.getId().getName()+" "+b.getCapacity()+"人", b);
		}
	}

	public Map<String, Ballpark> getBallparkItems() {
		return ballparkItems;
	}

	public static void setBallparkItems(Map<String, Ballpark> ballparkItems) {
		Bb.ballparkItems = ballparkItems;
	}

	public String next(){
		create();
		return null;
	}
	
	public void create(){
		db.create(new Ballpark(new BallparkId(year, name), cap));
	}

	public List<Ballpark> getAll(){
		return db.getAll();
	}
	
	public Map<Integer, Integer> getYearItems() {
		return yearItems;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}
		
}
