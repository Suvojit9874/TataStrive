package Java8;
interface Annonymous{
//	void draw();
//	void multi();
	//void show();
		//void mul();
		//public String say();
		int add(int a,int b);
		//public String say(String name);
}
public class AnnonymousDemo {
	public static void main(String[] args) {
/*		Annonymous obj =new Annonymous() {
			
			@Override
			public void multi() {
				System.out.println(5*6);
			}
			@Override
			public void draw() {
				System.out.println("i am drawing ");
			}
		 };
		 
		 obj.draw();
		 obj.multi();      */
		
		
		
		
		
		// you can do this using lamda expression
		// we can use lamda expression only in functional interface 
/*		Annonymous lamda=()->{
			System.out.println("hi lamda");
		};               */
		
		
//		lamda.draw();    
	
		
	/*	Annonymous s=()->{
			return "I have nothing to say";
		};
		System.out.println(s.say());       */
		
/*		Annonymous s1=name->{
			return "hello"+name;
		};
		System.out.println(s1.say("Suvojit"));        */
		
/*		Annonymous ad1=(int a,int b)->{
			return a+b;
		//System.out.print(ad1.add(10, 20));
		};
		System.out.println(ad1.add(10, 20));       */
		
		Annonymous ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
	}
	

}
