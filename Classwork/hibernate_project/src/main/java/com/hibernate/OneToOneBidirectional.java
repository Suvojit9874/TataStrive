package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneBidirectional {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().
    			configure("hibernate.cfg.xml").
    			buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	//create question
    	Question3 q1=new Question3();
    	q1.setQuestion_id(101);
    	q1.setQuestion("What is java? ");
    	
    	//creating answer
    	Answer3 answer1=new Answer3();
    	answer1.setAnswer_id(201);
    	answer1.setAnswer("java is a programming language");
    	answer1.setQuestion(q1);
    	q1.setAnswer(answer1);
    	
    	session.save(q1);
    	session.save(answer1);
    	

    	tx.commit();
    	session.close();
    	factory.close();

	}

}

