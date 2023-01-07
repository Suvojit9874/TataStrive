package TataStrive.Classwork.inheritance;

class Addition
{
    public void add(int a)
    {
        System.out.println("Addition value of one parameter: "+(a+10));
    }
    public void add(int a,int b,int c)
    {
        System.out.println("Addition value of 3 parameters: "+(a+b+c));
    }
    public void add(int a,double b)
    {
        System.out.println("Addition value of 2 parameters(int,double): "+(a+b));
    }
    public void add(double a,int b)
    {
        System.out.println("addition value of 2 parameters(double,int): "+(a+b));
    }
}
public class MethodOverloading {

    public static void main(String[] args) {
        Addition ad=new Addition();
        ad.add(100);
        ad.add(12,34,10);
        ad.add(12.5, 4);
        ad.add(89,50.8);
    }

}
