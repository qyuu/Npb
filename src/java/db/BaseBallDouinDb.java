package db;

import entity.BaseballDouin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BaseBallDouinDb {
	@PersistenceContext
	private EntityManager em;
	
	public void create(BaseballDouin bpd){
		em.persist(bpd);
	}
}
