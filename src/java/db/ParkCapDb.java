/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.ParkCap;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yuu
 */
@Stateless
public class ParkCapDb {
	@PersistenceContext
	private EntityManager em;
	
	public void create(ParkCap parkCap){
		em.persist(parkCap);
	}
}
