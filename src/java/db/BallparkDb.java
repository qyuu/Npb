package db;

import entity.Ballpark;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BallparkDb {
	@PersistenceContext
	private EntityManager em;
	
	public void create(Ballpark ballpark){
		em.persist(ballpark);
	}
	
	public List<Ballpark> getAll(){
		return em.createQuery("select c from Ballpark c ").getResultList();
	}
}
