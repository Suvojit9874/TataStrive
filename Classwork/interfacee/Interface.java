package TataStrive.Classwork.interfacee;
interface PrintTable{
    int x=100;
    void display();
    void fun();
}
class print implements PrintTable{

    @Override
    public void display() {
        System.out.println("this is display");
    }

    @Override
    public void fun() {
        System.out.println("java is fun");
    }
}
class Message implements PrintTable{

    @Override
    public void display() {
        System.out.println("Hello world");
    }

    @Override
    public void fun() {
        System.out.println("fun learning");
    }
}
public class Interface {
    public static void main(String[] args) {
        PrintTable p ;
        p=new print();
        p.display();
        p.fun();
        p = new Message();
        p.display();
        p.fun();

    }


}
