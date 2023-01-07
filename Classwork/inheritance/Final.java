package TataStrive.Classwork.inheritance;

public class Final {
  final  int a =100;
    public static void main(String[] args) {
        Final F= new Final();
//        F.a = 40;         //final keyword use korar por variable er value change kora jai na
        //final keyword use korar por class ke inheritance kora jaina
        //final keyword use korar por method ke overload kora jaina

        System.out.println(F.a);
    }
}
