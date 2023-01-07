package TataStrive.ThursdayLab;
import java.util.Scanner;
public class AdditionArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row size of the 1st matrix ");
        int r1=sc.nextInt();
        System.out.println("Enter the column size of the 1st matrix");
        int c1=sc.nextInt();
        int [][]arr1 = new int [r1][c1];
        System.out.println("Enter the input for 1st matrix");		//taking input from the user
        for (int i =0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row size of the 2nd matrix ");
        int r2=sc.nextInt();
        System.out.println("Enter the column size of  the  2nd matrix");
        int c2 = sc.nextInt();
        int [][]arr2 = new int [r2][c2];
        System.out.println("Enter the input for 2nd matrix");	//taking input for 2nd matrix
        for (int i =0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int [] [] sum=new int [r1][c1];
        if (r1==r2 && c1==c2){					//if row and column no of two matrix are not same
            //then sum cannot be possible
            for (int i =0;i<arr2.length;i++){
                for (int j=0;j<arr2[i].length;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }

            System.out.println("the sum of two matrix is ");		//output sum matrix
            for (int i =0;i<arr2.length;i++){
                for (int j=0;j<arr2[i].length;j++){
                    System.out.print(sum[i][j]+ "  ");
                }
                System.out.println();
            }

        }else {
            System.out.println("Addition of two Different size of matrix can not possible");
        }

    }

}
