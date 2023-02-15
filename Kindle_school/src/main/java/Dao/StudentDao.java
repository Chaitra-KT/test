package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.student;

public class StudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void savestudent(student	 s1) {
		et.begin();
		em.persist(s1);
		et.commit();
	}
	public student findstudent(String email) {
		List<Student> list= em.createQuery("select x from Teacher student");
		if(list.isEmpty()) {
			return null;
		}else
		{return list.get(0);
			
		}
	}

}
