package TataStrive.Classwork.inheritance;

public class BlankFinalVariable {
    static final int data;
    static
    {
        data=45;
    }
    int cube(final int n)
    {
        //n=n+1;//final local variable n can not be assigned. it must be blank
        return n*n*n;
    }


    public static void main(String[] args) {
        System.out.println(BlankFinalVariable.data);

    }

}
