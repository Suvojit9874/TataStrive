package Collection.comperator;

public class Employee {
  int empid;
  String name;
  int Salary;
    public Employee(int empid, String name, int salary) {
	   super();
	   this.empid = empid;
	   this.name = name;
	   Salary = salary;
    }
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return Salary;
	}
    
}
