package entity;

import java.util.Objects;
import javax.persistence.Embeddable;


public class NpbTeam {
	String name;

	public NpbTeam(){}
	
	public NpbTeam(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 89 * hash + Objects.hashCode(this.name);
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
		final NpbTeam other = (NpbTeam) obj;
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}


}
