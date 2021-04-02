package com.grwt;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Program started..." );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
        Address ad=new Address();
        ad.setStreet("Street1");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate( new Date());
        ad.setX(123.344);
        
        FileInputStream fs=new FileInputStream("src/main/java/tree.jpg");
        byte[] data=new byte[fs.available()];
        fs.read();
        ad.setImage(data);
;        
        
        Student st=new Student();
        st.setId(101);
        st.setName("John");
        st.setCity("Delhi");
        System.out.println(st);
        
        Session session = factory.openSession();
        
        session.beginTransaction();
        session.save(st);
        session.save(ad);
        session.getTransaction().commit();
        
        session.close();
        System.out.println("Done...");
    }
  
    
}
