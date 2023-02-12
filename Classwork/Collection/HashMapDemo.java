package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
		public static void main(String[] args) {
			// allows us to store key value pair
			// where key should be unique
			//java hashMap contains values based on the key
			// may have one null key and multiple null values
			//non synchronize
			// maintain no order
			HashMap<Integer, String> map =new HashMap<>();
			map.put(1, "Suvojit");
			map.put(2, "Soumen");
			map.put(3, "argha");
			map.put(1, "Suvojit");
			map.put(5, "Suvo");
			System.out.println(map);
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey() +"  "+m.getValue());	
			}
			System.out.println("-----------------------------");
			
			HashMap<Integer, String> map1 =new HashMap<>();
			
			map1.putAll(map);
			map1.replace(5, "Suvo" ,"debu");
			for(Map.Entry m:map1.entrySet()) {
				System.out.println(m.getKey() +"  "+m.getValue());
//				System.err.println("-----------------------------");
			}
			
			
			
		}
}
