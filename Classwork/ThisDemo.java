package TataStrive.Classwork;
class A2{
    A2(){
        this(10);
        System.out.println("this is A2");
    }
    A2(int x){
        System.out.println(x);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        A2 a= new A2();
    }
}
