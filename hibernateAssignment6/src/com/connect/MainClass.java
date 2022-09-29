package com.connect;

import java.util.Map;
import java.util.TreeMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.map.Continent;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Continent.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Map<String, String> map1 = new TreeMap<>();
		map1.put("India", "Delhi");
		map1.put("Nepal", "Kathmandu");
		map1.put("Sri Lanka", "Colombo");
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("Rome", "Italy");
		map2.put("France", "Paris");
		map2.put("Germany", "Berlin");
		
		Continent c1 = new Continent();
		c1.setContinentName("Asia");
		c1.setCountries(map1);
		
		Continent c2 = new Continent();
		c2.setContinentName("Europe");
		c2.setCountries(map2);
		
		
		
		session.save(c1);
		session.save(c2);
		tx.commit();
		session.close();
	}

}
