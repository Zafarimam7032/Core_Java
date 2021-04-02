package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.grwt.Student;

public class HqlExample {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		String query="from Student where s.city=:x and s.name=:n";
		Query q = s.createQuery(query);
		q.setParameter("x", "Lucknow");
		q.setParameter("n", "peter");
		
		List<Student> list = q.list();
		for(Student student:list) {
			System.out.println(student.getName()+" : "+student.getCerti().getCourse());
		}
		Query q2 = s.createQuery("delete from Student s where s.city=:c");
		int r = q2.executeUpdate();
		System.out.println("deleted:");
		System.out.println(r);
		
		
		s.close();
		factory.close();
	}

}
