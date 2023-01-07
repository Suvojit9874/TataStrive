package TataStrive.Classwork.Array.BookManagementSystem;
import java.util.Scanner;
public class BookMain {
    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        BookService bservice=new BookService();
        System.out.println("Welcome To Book Management System");
        do {
            System.out.println("\n1.create book\n2.get all book\n3.get book by id \n4.Update \n5.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    bservice.createBook();
                    break;
                case 2:
                    BookService.getAllBook();
                    break;
                case 3:
                    BookService.searchById();
                    break;
                case 4:
                    BookService.update();
                    break;
                case 5:
                    System.exit(0);

            }
            System.out.println("Thanks for visit us");
        }while(true);

    }

}
