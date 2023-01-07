package TataStrive.Classwork;
class A1{
    A1(){
        System.out.println("this is a default constructor");
    }
    A1(int x){
        this();     //this() will call the default constructor
        System.out.println(x);
    }
}
public class ThisDemo2 {
    public static void main(String[] args) {
        A1 a = new A1(10);
    }
}
