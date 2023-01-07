package TataStrive.ThursdayLab;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1 ; i<= num ; i++){
            if (num==0){
                factorial=1;
            }else {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial of "+num+" is : " + factorial);
    }

}
