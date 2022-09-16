package com.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Employe;

public class ClientProgram {
	
	public static void Update() {
		Configuration configuration =  new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Employe.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Employe e1 = new Employe(101, "virat", "1 year");
		Employe e2 = new Employe(102, "kavya", "1.5 year");
		Employe e3 = new Employe(103, "bella", "2 year");
//		
//		
//		session.save(e1);
		session.save(e2);
		session.save(e3);
		
//		Employe e = session.get(Employe.class, 102);
//		e.setEmploye_Name("rita");
//		e.setEmploye_Band("5 year");
		transaction.commit();
		session.close();
		
	}
	
	public static void Read() {
		Configuration configuration =  new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Employe.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Employe e1 = session.get(Employe.class, 101);
		
		System.out.println("The Details: "+e1);
		transaction.commit();
		session.close();
		
	}
	
	public static void Delete() {
		Configuration configuration =  new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Employe.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Employe e1 = session.get(Employe.class, 102);
		
		session.delete(e1);
		System.out.println("Item deleted Successfully");
		transaction.commit();
		session.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Update();
		//Read();
		//Delete();
		

	}

}
