package TataStrive.Classwork;
import java.util.Scanner;
class std {

    std(){
        System.out.println("i  am running");
    }
    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you college name");               //Static block run 1st in the programme
       String clgNAme= sc.nextLine();
    }
}
public class CountConstructor {
        static int count  = 0;
        CountConstructor(){
            count ++;

        }

    public static void main(String[] args) {
        std s  = new std();
        CountConstructor c1 = new CountConstructor();
        CountConstructor c2 = new CountConstructor();
        CountConstructor c3 = new CountConstructor();

        System.out.println(count);
    }
}
