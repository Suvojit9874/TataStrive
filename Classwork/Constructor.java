package TataStrive.Classwork;
class Student2 {
    //Instance Variable
    int id;
    String name, address;
    long phno;
    //Constructor
public Student2(int id, String name, String address, long ph) {
        this.id = id;       //this.  na dile local variable r instance variable bujte parbena tai 0 print hoye jabe
        this.name = name;
        this.address = address;
        phno = ph;
    }
    public void getData() {
        System.out.println("Id: " + id + "\n Name: " + name + "\n Address: " + address + "\n Phone No: " + phno);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student2 rajat = new Student2(101, "Rajat Dey", "Sodepur", 9826725226l) ;
        Student2 suvojit = new Student2(101, "Suvojit", "Sodepur", 9826725226l) ;
        Student2 Debobrata = new Student2(101, "debu", "Sodepur", 9826725226l) ;
        rajat.getData();
        suvojit.getData();
        Debobrata.getData();
    }
}
