package TataStrive.Assignment;
import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        float Salary = sc.nextInt();
        if (Salary>1500){
            Salary = Salary + ((Salary*20)/100.0f) + ((Salary*90)/100.f);
        }
        else {
            Salary = Salary + 500 + ((Salary*70)/100.f);
        }
        System.out.println("Your Gross Salary is :" + Salary);
        System.out.println("For how many Years You have been working in this company");
        int years = sc.nextInt();
        if (years>3){
            Salary = Salary + 2500;
            System.out.println("Rs 2500 Bonus Added to your salary ,Your Gross Salary is :" + Salary);

        }
    }
}
