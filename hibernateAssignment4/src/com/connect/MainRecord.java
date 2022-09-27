package com.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pojoclass.Employe;
import com.pojoclass.EmployeLogTab;;

public class MainRecord {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Configuration configuration =  new Configuration();
		configuration.addAnnotatedClass(com.pojoclass.Employe.class);
		configuration.addAnnotatedClass(com.pojoclass.EmployeLogTab.class);
		configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employe e = new Employe("leena", "SE", 26/10/1999, 07/03/2022, 22, 20000);
		Employe e1 = new Employe("rachita", "SS", 0, 0, 23, 20000);
		Employe e2 = new Employe("jitendra", "SSS", 26/10/1999, 07/03/2022, 24, 25000);
		Employe e3 = new Employe("Deepa", "SSE", 26/10/1999, 07/03/2022, 25, 28000);
		Employe e4= new Employe("Shar", "SE", 26/10/1999, 07/03/2022, 22, 30000);
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		Employe e11 = session.get(Employe.class, 2);
		session.delete(e11);
		
		
		Employe e21 = session.get(Employe.class, 8);
		session.delete(e21);
		System.out.println("Item deleted Successfully");
		
		
		EmployeLogTab t1 = new EmployeLogTab("jitendra","SSE",50000, 01/02/2022);
		session.save(t1);
		
		
		transaction.commit();
		session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
