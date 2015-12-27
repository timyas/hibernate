package hibernate.test;

import hibernate.test.dto.EmployeeEntity;

import org.hibernate.Session;

public class TestHibernate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
       
		//Add new Employee object
		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmail("max@gmail.com");
		emp.setFirstName("Maxim");
		emp.setLastName("Solovey");
		
		session.save(emp);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
