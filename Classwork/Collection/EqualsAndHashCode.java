package Collection;
class Person extends Object{
	int id;
	String name;
	int salary;
	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
/*	@Override
	public boolean equals(Object obj) {
		// if both has same reference 
		if (this==obj) {
			return true;
		}
		//if parameter is null or both are not in same class;
		else if(obj==null || this.getClass() !=obj.getClass()) {
			return false;
		}
		//compare using data member  
		Person p= (Person) obj; 
		return this.id==p.id && this.name==p.name && this.salary==p.salary;
	}																	*/
	@Override
	public boolean equals(Object obj) {
		Person person=(Person) obj;
		if(this.getName().equalsIgnoreCase(person.getName())) {
			return true;
		}
		else return false;
	}
	
	@Override
	public int hashCode() {
		return this.id %10;
	}
}
public class EqualsAndHashCode {
	public static void main(String[] args) {
		Person p1 = new Person(101,"Suvojit",160000);
		Person p2 = new Person(101,"Suvojit",160000);
		Person p3 =new Person(0,null,0);
		Person p4 =p1;   // same reference 
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(p2));   // data member are same 
		System.out.println(p1.equals(p3));  // p3 is null
		
		
		
		System.out.println(p1.hashCode() +" " + p2.hashCode());
		if (p1.hashCode()==p2.hashCode()) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}
