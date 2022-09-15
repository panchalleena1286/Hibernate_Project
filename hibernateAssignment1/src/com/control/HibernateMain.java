package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Employee;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration =  new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Employee.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee(101, "Amit", "PM", 100000);
		Employee e2 = new Employee(102, "Soniya", "HR", 20000);
		Employee e3 = new Employee(103, "Rachita", "SD", 200000);
		Employee e4 = new Employee(104, "Ashutosh", "WD", 300000);
		Employee e5 = new Employee(105, "Jitendra", "SD", 400000);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		
		transaction.commit();
		session.close();
		

	}

}
