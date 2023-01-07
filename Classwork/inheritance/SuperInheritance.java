package TataStrive.Classwork.inheritance;
class User{
    int id;
    String name;
    String address;

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
class Emp extends User{
    float salary;
    String Designation;
    public Emp(int id, String name, String address, int salary, String Designation) {
        super(id, name, address);
        this.salary = salary;
        this.Designation = Designation;
    }
    public void getData(){
        super.display();
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + Designation);
    }
}
public class SuperInheritance {
    public static void main(String[] args) {
        Emp em = new Emp(102,"Soumen","kolkata",12000,"HR");
        em.getData();
    }
}
