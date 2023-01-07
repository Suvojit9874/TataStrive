package TataStrive.Classwork.Array;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [][]arr = new int [5][];
        int count =0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<i+1;j++) {
                arr[i][j]=count++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
