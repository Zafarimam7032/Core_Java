package com.todo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    		Student student=new Student();
    		student.setId(101l);
    		student.setFirstName("Ashi");
    		student.setLastName("Choudhary");
    		student.setEmail("123@gmail.com");
    		
    			
    			
    	factory.close();
    }
}
