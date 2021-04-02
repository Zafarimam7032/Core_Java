package com.grwt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embed {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		System.out.println(factory);
		
		Student st=new Student();
		st.setId(12);
		st.setName("Sonia");
		st.setCity("Delhi");
		System.out.println(st);

		Student st1=new Student();
		st1.setId(13);
		st1.setName("Ashi");
		st1.setCity("Delhi");
		System.out.println(st1);
		
		Certificate ct1=new Certificate();
		ct1.setCourse("Java");
		ct1.setDuration("4 months");
		st1.setCerti(ct1);
		
		Certificate ct=new Certificate();
		ct.setCourse("Android");
		ct.setDuration("2 months");
		st.setCerti(ct);
		
		
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);

		tx.commit();
		
		session.close();
		factory.close();
	}

}
