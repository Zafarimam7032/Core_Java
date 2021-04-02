package com.grwt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		System.out.println(factory);
		Session session=factory.openSession();
		Student student = session.load(Student.class, 101);
		System.out.println(student);
		
		
		Address ad=session.load( Address.class,1);

		Address ad1 = session.load(Address.class, 1);
		
			
		session.close();
		factory.close();
	}

}
