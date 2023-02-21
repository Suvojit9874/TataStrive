package com.OneToManyAssignment;

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
		Instructor i1=new Instructor();
		Instructor i2=new Instructor();
		i1.setInstructorId(101);
		i1.setInstructorName("Nilanjan Sir");
		i2.setInstructorId(102);
		i2.setInstructorName("Puja ma'am");
		Courses c1=new Courses();
		Courses c2=new Courses();
		Courses c3=new Courses();
		Courses c4=new Courses();
		c1.setCourseId(201);
		c1.setCourseName("JAVA");
		c1.setInstructor(i1);
		c2.setCourseId(202);
		c2.setCourseName("Hibernate");
		c2.setInstructor(i1);
		c3.setCourseId(203);
		c3.setCourseName("YDM");
		c3.setInstructor(i2);
		c4.setCourseId(204);
		c4.setCourseName("Soft Skill");
		c4.setInstructor(i2);
		List<Courses> list1=new ArrayList<>();
		List<Courses> list2=new ArrayList<>();
		list1.add(c1);
		list1.add(c2);
		list2.add(c3);
		list2.add(c4);
		i1.setCourses(list1);
		i2.setCourses(list2);
		session.save(i1);
		session.save(i2);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		tx.commit();
		session.close();
		factory.close();
		
		
	}
	
}
