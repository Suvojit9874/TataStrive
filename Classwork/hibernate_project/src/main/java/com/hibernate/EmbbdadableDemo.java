package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbbdadableDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
    			buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	//creating student
    	Student student1=new Student();
    	student1.setsName("Anindya");
    	student1.setCity("kolkata");
    	// creating Certificate
    	Certificate certificate=new Certificate();
    	certificate.setCourseName("java");
    	certificate.setDuration("4 months");
    	student1.setCertificate(certificate);
    	//save objects
    	session.save(student1);
    	
    	tx.commit();
    	session.close();
    	factory.close();
   

	}

}
