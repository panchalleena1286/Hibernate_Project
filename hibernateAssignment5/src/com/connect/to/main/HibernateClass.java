package com.connect.to.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hiber.Options;
import com.hiber.Question;

public class HibernateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQname("What is java");
		List<String> list = new ArrayList<String>();
		list.add("Scripting Language");
		list.add("Programming Language");
		list.add("HyperText Markup Language");
		list.add("English Language");
		q1.setOptions(list);
		q1.setAnswer("Programming Language");
		session.save(q1);
		
		Question q2 = new Question();
		q2.setQname("What is HTML");
		List<String> list2 = new ArrayList<String>();
		list2.add("HyperText Markup Language");
		list2.add("Programming Language");
		list2.add("Scripting Language");
		list2.add("English Language");
		q2.setOptions(list2);
		q2.setAnswer("HyperText Markup Language");
		
		
		session.save(q2);
		
		tx.commit();
		session.close();
		System.out.println("success");
	}

}
