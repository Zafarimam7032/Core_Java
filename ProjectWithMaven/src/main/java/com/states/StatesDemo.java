package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.grwt.Certificate;
import com.grwt.Student;

public class StatesDemo {

	public static void main(String[] args) {
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Student student=new Student();
		student.setId(123);
		student.setName("peter");
		student.setCity("Lucknow");
		student.setCerti(new Certificate("java hibernate course","2 months"));
		
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(student);
		
		tx.commit();
		f.close();
	}

}
