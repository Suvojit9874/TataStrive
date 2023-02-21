package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyExample {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employees e1=new Employees();
		Employees e2=new Employees();
		e1.setEid(34);
		e1.setName("Nilanjan");
		e2.setEid(35);
		e2.setName("soumen");
		List<Employees> list1=new ArrayList<>();
		list1.add(e1);
		list1.add(e2);
		Projects p1=new Projects();
		Projects p2=new Projects();
		p1.setPid(12121);
		p1.setProject_name("Library management system");
		p2.setPid(12322);
		p2.setProject_name("chatGpt");
		List<Projects> list2=new ArrayList<>();
		list2.add(p1);
		list2.add(p2);
		p1.setEmps(list1);
		p2.setEmps(list1);
		e2.setPros(list2);
		e1.setPros(list2);
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		tx.commit();
		factory.close();
		session.close();
		
	}

}
