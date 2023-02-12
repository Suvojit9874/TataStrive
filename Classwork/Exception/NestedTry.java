package Exception;

public class NestedTry {

	public static void main(String[] args) {
	    try{ //outer try

            //inner try 1
            try{
                int a=39/0;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            //inner try 2
            try{
                int arr[]=new int [5];arr[5]=4;
            }catch (ArrayIndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
            }      
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("outer code");

	}

}
