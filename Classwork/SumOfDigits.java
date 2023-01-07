package TataStrive.Classwork;

public class SumOfDigits
{
    public static void main(String args[])
    {
       int n = 12311213;
       int sum = 0;
       while(n!=0){

           int r=n%10;

           sum = sum + r;
           n=n/10;
       }
        System.out.println(sum);
    }
}
