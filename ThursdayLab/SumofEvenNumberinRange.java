package TataStrive.ThursdayLab;
import java.util.Scanner;

public class SumofEvenNumberinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting range");
        int startingRange = sc.nextInt();
        System.out.println("Enter the ending range");
        int endingRange = sc.nextInt();
        int sum=0;
        for (int i =startingRange ;i<=endingRange;i++){
            if (i%2==0){
                System.out.println(i);
                sum=sum +i;
            }
        }
        System.out.println("Sum of the given range even number is : " + sum);
    }
}
