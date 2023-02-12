package Collection;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
  public static void main(String[] args) {
	HashSet<String> hset =new HashSet<>();
	hset.add("apple");
	hset.add("apple");
	hset.add("mango");
	hset.add("orange");
	hset.add("kiwi");
//	hset.add(null);   // we can add null value
	System.out.println(hset);

	
	hset.removeIf((str)->str.contains("an"));
	Iterator itr=hset.iterator();
	
	System.out.println("=====================");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
  }
}
