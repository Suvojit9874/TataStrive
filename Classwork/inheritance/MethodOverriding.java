package TataStrive.Classwork.inheritance;
class ParentBank{
    public void LoanInterest(){
        System.out.println("9% interest");
    }

}
class ChildSbi extends  ParentBank{
    public void LoanInterest(){
        System.out.println("7.75% interest");
    }
}
class ChildAxis extends  ParentBank{
    @Override
    public void LoanInterest(){
        System.out.println("10% interest");
    }
}
class ChildHDFC extends  ParentBank{
    public void LoanInterest(){
        System.out.println("12% interest");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ParentBank pm ;
        pm = new ChildAxis();
        pm.LoanInterest();
        pm = new ChildSbi();
        pm.LoanInterest();
        pm = new ChildHDFC();
        pm.LoanInterest();

    }
}
