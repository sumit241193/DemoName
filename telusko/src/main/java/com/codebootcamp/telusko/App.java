package com.codebootcamp.telusko;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	public static void main(String[] args) {

		

		Configuration con = new Configuration().configure();
		con.addAnnotatedClass(Student.class);
		

		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session session1 = sf.openSession();
		
		
		
		session1.beginTransaction();
		
		Query query=session1.createQuery("from Student where rollno=5");
		
		Student s=(Student)query.uniqueResult();
		session1.getTransaction().commit();
		
		System.out.println(s);


		session1.close();

		

		

	}
}
