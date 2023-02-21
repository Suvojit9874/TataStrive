package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml")
    			.buildSessionFactory();
    	
      Session session =factory.openSession();
      Transaction tx=session.beginTransaction();
      Book book3=new Book();
      book3.setBookName("c");
      book3.setPrice(500.00);
      book3.setBookPages(200);
//      FileInputStream fis=new FileInputStream("src/main/java/1.jpg");
//      byte []data=new byte[fis.available()];
//      fis.read(data);
//      book3.setImage(data);
      session.save(book3);
      
      Book book=session.get(Book.class, 1);
      System.out.println(book.getBookId());
      System.out.println(book.getBookName());
      System.out.println(book.getPrice());
      System.out.println(book.getBookPages());
      System.err.println("==========================");
      Book book1=session.load(Book.class, 2);
      System.out.println(book1.getBookId());
      System.out.println(book1.getBookName());
      System.out.println(book1.getPrice());
      System.out.println(book1.getBookPages());
      tx.commit();
      session.close();
      factory.close();
    }
}
