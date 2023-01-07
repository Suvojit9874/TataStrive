package TataStrive.Classwork;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

class Employee1
{
    int id;
    String name,city,designation,country;
     static String  state = "WB";               //sobar state same tai static kore dile bara bar declyer korte hobena
    long phno,salary;
    public Employee1(int id,String name,String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
    }

    public Employee1(int id, String name,String city,String country,String state)
    {
        this(id,name,city);
        this.country=country;
        this.state=state;
    }
    public Employee1(int id, String name,String city,String country,String state,long phno,long salary,String designation)
    {
        this(id,name,city,country,state);
        this.phno=phno;
        this.salary=salary;
        this.designation=designation;
    }

    public  int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public long getPhno() {
        return phno;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

}
public class ConstructorChaining {

    public static void main(String[] args) {
        Employee1 emp1=new Employee1(101, "Suvojit", "kolkata");
        System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getCity());
        Employee1 emp2=new Employee1(101, "Arpan","Sreerampore", "India", "WB");
        System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getCity()+" "+emp2.getCountry()+" "+emp2.getState());
        Employee1 emp3 = new Employee1(121 , "Soumen", " kolkata" , " india" , "WB", 9831745634l, 250000,"HR");
        System.out.println(emp3.getId() + " " + emp3.getName() + " " + emp3.getCity()+" " + emp3.getCountry() + " " + emp3.getState()+ " "+  emp3.getPhno() + " " + emp3.getSalary()+" " + emp3.getDesignation());

    }

}
