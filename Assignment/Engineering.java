package TataStrive.Assignment;
import java.util.Scanner;
//1st we have made some methods depends upon stream
public class Engineering {
    public static void CSE(){
        System.out.println("You have Choose Computer Science Engineering , Your subject are  CC1 ,CC2 , CC3  ,Are you Sure? \n Choose 1) YES \n 2)No");
    }
    public static void Electronics(){
        System.out.println("You have Choose Computer Science Electronics , Your subject are  CC1 ,CC2 , CC3  ,Are you Sure? \n Choose 1) YES \n 2)No");

    }
    public static void CSE_AIML(){
        System.out.println("You have Choose Computer Science Engineering Specialised in Ai Ml, Your subject are  CC1 ,CC2 , CC3  ,Are you Sure? \n Choose 1) YES \n 2)No");


    }
    public static void  Mechanical(){
        System.out.println("You have Choose  Mechanical , Your subject are  CC1 ,CC2 , CC3 ,Are you Sure? \n Choose 1) YES \n 2)No");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        do {
            System.out.println("Enter Your Stream Code : \n 1) CSE \n 2) Electronics \n 3) CSE Specialised In AI/ML \n 4) Mechanical");
            int code = sc.nextInt();
            switch (code) {
                case 1:CSE();
                    int option = sc.nextInt();
                    if (option ==1){
                        System.out.println("Congratulation");
                        n=0;
                    } else if (option==0) {
                        break;
                    }
                    break;
                case 2 : Electronics();
                    option = sc.nextInt();
                    if (option ==1){
                        System.out.println("Congratulation");
                        n=0;
                    } else if (option==0) {
                        break;
                    }
                    break;
                case 3: CSE_AIML();
                    option = sc.nextInt();
                    if (option ==1){
                        System.out.println("Congratulation");
                        n=0;
                    } else if (option==0) {
                        break;
                    }
                    break;
                case 4: Mechanical();
                option=sc.nextInt();
                    if (option ==1){
                        System.out.println("Congratulation");
                        n=0;
                    } else if (option==0) {
                        break;
                    }
                    break;
            }
        }while(n != 0);
    }
}
