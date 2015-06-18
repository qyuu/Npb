package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class BallparkId implements Serializable{
	private Integer fyear;
	private String name;

	public BallparkId(){}
	public BallparkId(Integer fyear, String name){
		this.fyear = fyear;
		this.name = name;
	}

	public Integer getFyear() {
		return fyear;
	}

	public void setFyear(Integer fyear) {
		this.fyear = fyear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(this.fyear);
		hash = 67 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final BallparkId other = (BallparkId) obj;
		if (!Objects.equals(this.fyear, other.fyear)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}
	
	
}
