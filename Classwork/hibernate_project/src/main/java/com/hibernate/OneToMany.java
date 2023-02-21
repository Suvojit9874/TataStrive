package com.hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		

	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	//create question
/*	Question2 q1=new Question2();
	q1.setQuestion_id(101);
	q1.setQuestion("What is java? ");
	
	//creating ans1
	Answer2 answer=new Answer2();
	answer.setAnswer_id(201);
	answer.setAnswer("java is a programming language");
	answer.setQuestion(q1);
	
	//creating ans2
	Answer2 answer1=new Answer2();
	answer1.setAnswer_id(202);
	answer1.setAnswer("with the help of java we can create software");
	answer1.setQuestion(q1);
	
	//creating ans3
	Answer2 answer2=new Answer2();
	answer2.setAnswer_id(203);
	answer2.setAnswer("java has different types of framework ");
	answer2.setQuestion(q1);
	
	List<Answer2> list=new ArrayList<Answer2>();
	list.add(answer);
	list.add(answer1);
	list.add(answer2);
	
	q1.setAnswer(list);
	
	session.save(q1);
	session.save(answer);
	session.save(answer1);
	session.save(answer2);							*/
	
	Question2 q=session.get(Question2.class, 101);
	System.out.println(q.getQuestion());
	for(Answer2 a:q.getAnswer()) {
		System.out.println(a.getAnswer());
	}
	
	
	
	tx.commit();
	session.close();
	factory.close();
}
}

