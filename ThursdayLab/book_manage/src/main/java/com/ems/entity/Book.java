package com.ems.entity;

public class Book {
	
	private long bookId;
	private String bookName;	
	private String authorName;
	private double price;
	private String publisher;
	public Book(long bookId, String bookName, String authorName, double price, String publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.publisher = publisher;
	}
	public long getBookId() {
		return bookId;
	}
	
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	
	

}
