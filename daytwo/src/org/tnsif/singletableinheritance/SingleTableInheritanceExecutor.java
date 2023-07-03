package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver class
public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create employee
		Employee emp = new Employee();
		emp.setEmpName("Pratik Desai");
		emp.setSalary(30000.2f);
		em.persist(em);
		
		//create employee-1
		Employee emp1 = new Employee();
		emp1.setEmpName("Prathamesh Chavan");
		emp1.setSalary(28000.2f);
		em.persist(em);
		
		//create manager
		Manager m = new Manager();
		m.setEmpName("Riddhi Patil");
		m.setSalary(89000.6f);
		m.setDeptName("Computer Science");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added succesfully");
		em.close();
		factory.close();
	}

}
