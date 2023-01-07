package TataStrive.Classwork.interfacee;

//abstract class.we can note create the object but we can create reference variable
abstract class Bank2
{
    //abstract method which have no body
    abstract public void getLoanInteret();
    //this is concrete method
    public void display()
    {
        System.out.println("This is a bank class");
    }
}
class Sbi2 extends Bank2
{

    @Override
    public void getLoanInteret() {
        System.out.println("We provide 6.9% interest");
    }

}
class Hdfc extends Bank2
{

    @Override
    public void getLoanInteret() {
        System.out.println("10% interest");
    }

}
public class interface2 {

    public static void main(String[] args) {

        Bank2 b=new Sbi2();
        b.getLoanInteret();
        b.display();
        b=new Hdfc();
        b.getLoanInteret();
        b.display();
    }

}
