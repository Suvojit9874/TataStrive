package Exception;

public class MultipleException {
	public static void main(String[] args) {
		int a =10,b=2;
		int []arr=new int[5];
		String string=null;
		try {
			System.out.println(a/b);
			arr[4]=30/5;
			System.out.println(arr[4]);
			System.out.println(string.length());
		}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		
			}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		
			}
	}

}
