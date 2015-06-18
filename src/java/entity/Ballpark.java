package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Ballpark implements Serializable{
	@EmbeddedId
	private BallparkId id;
	
	private Integer capacity;

	public Ballpark(){}
	public Ballpark(BallparkId id, Integer capacity){
		this.id = id;
		this.capacity = capacity;
	}
	
	public BallparkId getId() {
		return id;
	}

	public void setId(BallparkId id) {
		this.id = id;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
}
