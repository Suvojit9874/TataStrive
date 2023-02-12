package Java8;
interface Drawable{
	void draw();
	default void message(){
		System.out.println("java 8 support method body in interface using default keyword");
	}
	static int multiply(int a,int b ) {
		return a*b;
	}
}
class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("i am drawing ");
		
	}
	
}
public class DefaultMethod {
	public static void main(String[] args) {
	
	Circle c=new Circle();
	c.draw();
	c.message();
	System.out.println(Drawable.multiply(5, 8));
	
	}	
		
}
