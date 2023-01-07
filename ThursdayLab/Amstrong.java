package TataStrive.ThursdayLab;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num;
        int original1 = num;

        int digits = 0;
        while(num!=0){
            num = num /10;
            digits ++;
        }
        int sum = 0 ,r;
        while(original !=0){
          r =   original %10;
          sum = sum + (int)Math.pow(r,digits);
             original=original/10;
        }
        if (original1==sum){
            System.out.println("the number is Armstrong");
        }else {
            System.out.println("the number is not Armstrong");
        }

    }
}
