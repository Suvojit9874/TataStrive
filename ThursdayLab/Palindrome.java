package TataStrive.ThursdayLab;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is palindrome or not");
        int num = sc.nextInt();
        int sum = 0;
        int original = num;
        while(num!=0){

            int r=num%10;

            sum = (sum *10) + r;
            num=num/10;
        }
        if (sum == original){
            System.out.println("the number is palindrome");

        }else {
            System.out.println("The number is not a palindrome");
        }
    }
}
