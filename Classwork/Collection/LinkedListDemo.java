package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<>();
		names.add("Susmita");
		names.add("Koushik");
		names.add("Bipul");
		names.add("Arpan");
		names.add("Saptarshi");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		names.add(0, "Somali");
		System.out.println(names);
		names.addFirst("Junyed");
		System.out.println(names);
		names.addLast("Suvojit");
		System.out.println(names);
		names.removeFirst();
		System.out.println(names);
		names.removeLast();
		System.out.println(names);
		names.set(0, "Nilanjan Dasgupta");
		String name=names.get(4);
		System.out.println(names);
		System.out.println(name);
		 ListIterator listit=names.listIterator();
		 System.out.println("****************\nforward direction");
		 while(listit.hasNext())
		 {
			 System.out.println(listit.next());
		 }
		 System.out.println("****************\nbackward direction");
		 while(listit.hasPrevious())
		 {
			 System.out.println(listit.previous());
		 }
		
		System.out.println("****************\nDeceending order\n");
		Iterator it =names.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// ******************************************//
		
		if(names.contains("Arpan")) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		
		//**********************************************//
		 System.out.println(names);
//		System.out.println(names.pop());
//		 System.out.println(names.poll());
		 System.out.println(names.pollFirst());
		 System.out.println(names.pollLast());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
