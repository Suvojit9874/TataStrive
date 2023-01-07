package TataStrive.Classwork.Array.BookManagementSystem;
import java.util.Scanner;
public class BookService {
    static Book [] book =new Book[10];
    static Scanner sc = new Scanner(System.in);
    static int index =0;
    //create book method
    public void createBook(){
        int id;
        String bName;
        double price;
        System.out.println("Enter book id: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter book name");
        bName=sc.nextLine();
        System.out.println("enter the price of the book");
        price=sc.nextDouble();
        book[index]=new Book(id,bName,price);
        index++;
        System.out.println("New book Added Successfully");
    }
    //get all book details
    public static void getAllBook(){
        for (int  i=0;i<index;i++){
            System.out.println("Book id : " +book[i].getBookId());
            System.out.println("Book name : " +book[i].getBookName());
            System.out.println("Book price : " +book[i].getBookPrice());
        }
    }

    //get book by id
    public static void searchById(){
        System.out.println("Enter the book id : ");
        int bid = sc.nextInt();
        int i;
        for (i =0;i<index;i++){
            if (book[i].getBookId()==bid){
                System.out.println("Book id : " +book[i].getBookId());
                System.out.println("Book name : " +book[i].getBookName());
                System.out.println("Book price : " +book[i].getBookPrice());
                break;
            }
        }
        if (i==index){
            System.out.println("This is Not Available now");
        }
    }
    public static void update(){
        System.out.println("Enter book id");
        int id=sc.nextInt();
        for (int i=0;i<index;i++){
            if (book[i].getBookId()==id){
                System.out.println("Enter the new id");
                int new_id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new name");
                String new_name=sc.nextLine();

                System.out.println("Enter the price : ");
                double new_price=sc.nextDouble();

                book[i]=new Book(new_id,new_name,new_price);
                System.out.println("Book Is updated");

            }
            else {
                System.out.println("invalid id");
            }
        }

    }
}
