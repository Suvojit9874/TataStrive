package Exception;

public class ThrowAndThrows {
	  static void validAge(int age) throws AgeValidationException{
	        if (age<18){
	            throw new AgeValidationException("Age is not valid ");
	        }else {
	            System.out.println("Age is valid");
	        }
	    }
	    public static void main(String[] args) {
	        try {
	            validAge(15);
	        }catch (AgeValidationException e){
	            System.out.println(e.getMessage());
	        }
	    }
}
