package TataStrive.Classwork;

class Student1
{
    int id;
    String name,address;
    long phno;
    public void setData(int i,String n,String a,long ph)
    {
        id=i;
        name=n;
        address=a;
        phno=ph;
    }
    public void getData()
    {
        System.out.println("Id: "+id+"\nName: "+name+"\naddress: " +address+"\nPhone No: "+phno);
    }
}
public class ClassDemo1 {

    public static void main(String[] args) {
        Student1 rajat=new Student1();
        Student1 pritam=new Student1();
        Student1 pronnota=new Student1();
        //assigning value using instance of a class(not secure)
//		rajat.id=101;
//		rajat.name="Rajat Dey";
//		rajat.phno=7992289282l;
//		rajat.address="sodepur";
//
//		System.out.println("id: "+rajat.id);
//		System.out.println("Name: "+rajat.name);
//		System.out.println("PhNo: "+rajat.phno);
//		System.out.println("Address: "+rajat.address);
        //assigning value using method
        rajat.setData(101, "Rajat Dey", "Sodepur", 9826725226l);
        rajat.getData();
        System.out.println("===================================");
        pritam.setData(102, "Pritam Hore", "Barasat", 93648472134l);
        pritam.getData();
        System.out.println("===================================");
        pronnota.setData(103, "Pronnota Mondol", "DD", 7236253635l);
        pronnota.getData();


    }

}
