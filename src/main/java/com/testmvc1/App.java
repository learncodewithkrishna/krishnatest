package com.testmvc1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student=new Student();
        student.setId(1);
        student.setName("Raja");
        student.setAdd("London");
        student.setContact("8800534974");
        
       
        
        SessionFactory factory=new  Configuration().configure().buildSessionFactory();
     
       Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
       
        session.save(student);
       
       session.getTransaction().commit();
      // tx.commit();
       session.close();
       factory.close();
       
    }
}
