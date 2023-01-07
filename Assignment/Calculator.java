package TataStrive.Assignment;
import java.util.Scanner;
public class Calculator {
    static void add(float a ,float b){
        System.out.println(a+b);
    }
    static void subtraction(float a ,float b){
        System.out.println(a-b);
    }
    static void multiplication(float a ,float b){
        System.out.println(a*b);
    }
    static void division(float a ,float b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division ");
            int input =sc.nextInt();
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b=sc.nextInt();
            switch (input){

                case 1 -> add(a,b);
                case 2 -> subtraction(a,b);
                case 3 -> multiplication(a,b);
                case 4 -> division(a,b);
                default -> System.out.println("Enter a correct choice ");
            }
        }while(true);
    }
}
