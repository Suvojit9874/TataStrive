package Exception;

public class FinallyBlock {
	 public static void main(String[] args) {
	        try{
	            int a =25/0;
	        }catch (NullPointerException e){
	            System.out.println(e.getMessage());     //so here exception will occur but finally block always execute
	        }

	        finally{
	                System.out.println("Finally block always executed ,if exception handeled or not");
	            }

	    }
	}
