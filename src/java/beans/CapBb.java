package beans;

import db.BallparkDb;
import entity.Ballpark;
import entity.NpbTeam;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CapBb {
	@EJB
	BallparkDb ballparkDb;
	
	private Date gameDay;
	private NpbTeam homeTeam;
	private NpbTeam visiterTeam;
	private Integer douin;
	private Ballpark Ballpark;

	public Date getGameDay() {
		return gameDay;
	}

	public void setGameDay(Date gameDay) {
		this.gameDay = gameDay;
	}

	public NpbTeam getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(NpbTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public NpbTeam getVisiterTeam() {
		return visiterTeam;
	}

	public void setVisiterTeam(NpbTeam visiterTeam) {
		this.visiterTeam = visiterTeam;
	}

	public Integer getDouin() {
		return douin;
	}

	public void setDouin(Integer douin) {
		this.douin = douin;
	}

	public Ballpark getBallpark() {
		return Ballpark;
	}

	public void setBallpark(Ballpark Ballpark) {
		this.Ballpark = Ballpark;
	}
	
	
}
