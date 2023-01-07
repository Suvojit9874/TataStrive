package TataStrive.ThursdayLab;
import java.util.Scanner;
public class RatProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rats");
        int r =sc.nextInt();
        System.out.println("Enter the unit of rat consume");
        int unit = sc.nextInt();
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [ n];
        System.out.println("Enter the values of array");
        for (int i = 0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int totalConsumption = r*unit;
        int sum =0;
        int sum1 =0;
        for (int j : arr) {
            sum1 = sum1 + j;
        }
        while(sum<totalConsumption) {
            if (sum1 < totalConsumption) {
                System.out.println(0 + " total amount is not sufficient");
                return;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    sum=sum+arr[i];
                    if (sum == totalConsumption) {
                        System.out.println(i + 1 + " house is Sufficient");
                        return;
                    }
                }
            }
        }
    }
}
