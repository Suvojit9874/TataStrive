package Java8;


interface Parent
{
	default  void hi()
	{
		System.out.println("hi");
	}
	}
@FunctionalInterface
interface Message extends Parent
{
	void say();
	//void hello();
	default void msg()
	{
		System.out.println("default method");
	}
	
	}
public class FunctionalInterfaceDemo implements Message {

	public static void main(String[] args) {
FunctionalInterfaceDemo demo=new FunctionalInterfaceDemo();
demo.msg();
demo.say();

	}

	@Override
	public void say() {
		System.out.println("saying hello");
	}

}
//functional interface is an interface that contain exactly one abstract method
//it can have any number of default,static method.
