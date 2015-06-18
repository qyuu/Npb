package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ParkCap implements Serializable{
	@EmbeddedId
	private ParkCapId id;
	
	private Integer cap;
	
	public ParkCap(){}
	public ParkCap(ParkCapId id, Integer cap){
		this.id = id;
		this.cap = cap;
	}

	public ParkCapId getId() {
		return id;
	}

	public void setId(ParkCapId id) {
		this.id = id;
	}

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}
	
	
}
