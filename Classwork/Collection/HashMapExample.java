package Collection;

import java.util.HashMap;
import java.util.Map;

class Student{
	int roll;
	String name,course;
	public Student(int roll, String name, String course ) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	
	
}
public class HashMapExample {
	public static void main(String[] args) {
	
		Map<Integer,Student > map=new HashMap<>();
		map.put(1, new Student(101, "Bipul", "Btech"));
		map.put(2, new Student(102, "Arpan", "Btech"));
		map.put(3, new Student(103, "Suvojit", "Hons"));
		
		for(Map.Entry<Integer, Student> m:map.entrySet()) {
			int key = m.getKey();
			Student std=m.getValue();
			System.out.println( "Details : " + key );
			System.out.println("Roll : " + std.getRoll());
			System.out.println("Name :" +std.getName());
			System.out.println("Course : " +std.getCourse());
			System.out.println("-------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
