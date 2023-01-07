package TataStrive.Classwork.Array;

import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the values of array");
        for(int i =0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }

}
