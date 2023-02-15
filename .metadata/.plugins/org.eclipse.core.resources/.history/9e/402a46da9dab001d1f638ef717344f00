package emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import emp.dto.Employee;
@Component
public class EmployeeDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
public void saveEmployee(Employee employee) {
	et.begin();
	em.persist(employee);
	et.commit();
}
}
