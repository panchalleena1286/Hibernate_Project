package com.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernateAssignment2.Product;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Configuration configuration =  new Configuration();
		configuration.addAnnotatedClass(com.hibernateAssignment2.Product.class);
		configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product p1 = new Product("notebook", 100);
		Product p2 = new Product("pen", 10);
		Product p3 = new Product("Eraser", 10);
		Product p4 = new Product("bag", 700);
		Product p5 = new Product("shoes", 400);
		Product p6 = new Product("bottle", 200);
		Product p7 = new Product("tie", 20);
		Product p8 = new Product("lunchbox", 300);
		Product p9 = new Product("socks", 50);
		Product p0 = new Product("pencil", 10);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		session.save(p6);
		session.save(p7);
		session.save(p8);
		session.save(p9);
		session.save(p0);
		
		
		transaction.commit();
		session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
