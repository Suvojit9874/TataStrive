package Collection.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(103,"suvojit" , 120000));
		list.add(new Employee(102, "soumen", 140000));
		list.add(new Employee(101, "Bipul", 150000));
		list.add(new Employee(104, "Argha", 100000));
		System.out.println("sort by Id");
		Collections.sort(list,new IdComparator());
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			Employee employee =(Employee)itr.next(); //type casting 
			System.out.println(employee.getEmpid() +" " + employee.getName()+" "+employee.getSalary());
			
			
		}
		System.out.println("----------------------------------------------");
		
		
		System.out.println("sort by Salary");
		Collections.sort(list,new SalaryComparator());
		Iterator<Employee> itr1 =list.iterator();
		while(itr1.hasNext()) {
			Employee employee =(Employee)itr1.next(); 
			System.out.println(employee.getEmpid() +" " + employee.getName()+" "+employee.getSalary());
			
			
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.println("sort by Name");
		Collections.sort(list,new NameComparator());
		Iterator<Employee> itr2 =list.iterator();
		while(itr2.hasNext()) {
			Employee employee =(Employee)itr2.next(); 
			System.out.println(employee.getEmpid() +" " + employee.getName()+" "+employee.getSalary());
			
			
		}
	}
}
