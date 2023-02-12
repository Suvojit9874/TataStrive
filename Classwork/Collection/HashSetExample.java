package Collection;

import java.util.HashSet;


class Book{
	int id;
	String name,authorString;
	int quantity;
	public Book(int id, String name, String authorString, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.authorString = authorString;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthorString() {
		return authorString;
	}
	public int getQuantity() {
		return quantity;
	}
		
}
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Book> set =new HashSet<>();
		set.add(new Book(101, "java", "balagaruswami", 5));
		set.add(new Book(102, "c", "kanetkar", 3));
		set.add(new Book(103, "OS", "galvin", 10));
		
		for(Book b:set) {
			System.out.println("ID : " +b.getId());
			System.out.println("BOOK name: "+ b.getName());
			System.out.println("Authod name : " + b.getAuthorString());
			System.out.println("Quantity : "+b.getQuantity());
			System.out.println("------------------------------");
		}
	}
}
