package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class BaseballDouin implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer douin;
	private Date gameDay;
	private NpbTeam homeTeam;
	private NpbTeam visiterTeam;
	@OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE })
	private Ballpark ballpark;

	public BaseballDouin(){}
	public BaseballDouin(Integer douin, Date gameDay, NpbTeam homeTeam, NpbTeam visiterTeam, Ballpark ballpark){
		this.douin = douin;
		this.gameDay = gameDay;
		this.homeTeam = homeTeam;
		this.visiterTeam = visiterTeam;
		this.ballpark = ballpark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDouin() {
		return douin;
	}

	public void setDouin(Integer douin) {
		this.douin = douin;
	}

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

	public Ballpark getBallpark() {
		return ballpark;
	}

	public void setBallpark(Ballpark ballpark) {
		this.ballpark = ballpark;
	}
	
	
}
