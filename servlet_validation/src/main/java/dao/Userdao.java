package dao;

import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.catalina.Manager;

import dto.User;

public class Userdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et = em.getTransaction();
public void save(User u1) {
	et.begin();
	em.persist(u1);
	et.commit();
}
 public User find(String email) 
{
	return em.find(User.class,email);
}
	public List<User> fetchAll()
	{
		return em.createQuery("select x from User x").getResultList();
		//Query q=em.createQuery("select x from User x");
		//return q.getResultList();
	}
	public void delete(User user) {
	et.begin();
	em.remove(user);
	et.commit();

	}
	public void update(User user) {
		et.begin();
		em.merge(user);
		et.commit();
	}
}


