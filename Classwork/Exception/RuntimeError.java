package Exception;

public class RuntimeError {
	public static void main(String[] args) {
		int a=5,b=0;
		//System.out.println(a/b);//ArithmeticException
//		String str=null;//NullPointerException
//		int arr[]=new int[5];
//		arr[10]=7;//ArrayIndexOutOfBoundsException
//		System.out.println(arr[10]);
		//System.out.println(str.length());
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("Div by zero is not allowed");
		}
		System.out.println("Rest of code");
		System.out.println("after the ecxeption");

	}
}
