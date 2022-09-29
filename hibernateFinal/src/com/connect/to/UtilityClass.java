package com.connect.to;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.hibernate.util.HibernateUtil;
import com.to.Car;

public class UtilityClass {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Query<Car> sql = session.createQuery("From Car");
		List<Car> carlist = sql.getResultList();
		System.out.println("Get all the details of Car : ");
		for(Car aCar : carlist) {
			System.out.println( aCar.getRegNo() +", "
					+ ""+ aCar.getModel() +" , " + aCar.getManufacture() +", "+aCar.getColor()+", " +aCar.getPrice());
		}
		
		
		System.out.println();
		Query<Car> sql1 = session.createQuery("From Car where Manufacture LIKE 'V%' ");
		List<Car> carlist1 = sql1.list();
		System.out.println("Display Manufacturer name which are starting with 'V' : ");
		for(Car aCar : carlist1) {
			System.out.println(aCar.getManufacture());
		}
		
		
		System.out.println();
		Query<Car> sql2 = session.createQuery("From Car where RegNo = 'KL-07 AC 345' ");
		List<Car> carlist2 = sql2.list();
		System.out.println("Display the details of User Vehicle : ");
		for(Car aCar : carlist2) {
			System.out.println( aCar.getModel() +" , " + aCar.getManufacture() +", "+aCar.getColor()+", " +aCar.getPrice());
		}
		
		
		System.out.println();
		Query<Car> sql3 = session.createQuery("From Car where Price<=600000");
		List<Car> carlist3 = sql3.list();
		System.out.println("Display the details of Car price which is less than 600000 : ");
		for(Car aCar : carlist3) {
			System.out.println("RegNo = "+ aCar.getRegNo() +",  Model = "+ aCar.getModel() +" , Manufacture = " + aCar.getManufacture() +
					", Color = "+aCar.getColor()+", Price = " +aCar.getPrice());
		}
		
		
	}

}
