package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		System.out.println(factory);
		
		Question q1=new Question();
		q1.setQuestionId(123);
		q1.setQuestion("what is java");
		
		Answer a1=new Answer();
		a1.setAnswerId(321);
		a1.setAnswer("Java ia a programming language");
		a1.setQuestion(q1);
		
		Answer a2=new Answer();
		a2.setAnswerId(321);
		a2.setAnswer("with the help of java we can create softwares");
		a2.setQuestion(q1);
		
		Answer a3=new Answer();
		a3.setAnswerId(321);
		a3.setAnswer("Java has different type of frameworks");
		a3.setQuestion(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
	  	q1.setAnswers(list);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
//				s.save(q1);
//				s.save(a1);
//				s.save(a2);
//				s.save(a3);
		
		Question q=s.get(Question.class, 123);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers().size());
//		for(Answer a:q.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
	
				tx.commit();
		s.close();
		factory.close();
	}

}
