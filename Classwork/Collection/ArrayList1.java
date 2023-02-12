package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

		public static void main(String[] args) {
			//ArrayList<Integer> al=new ArrayList<Integer>();
			List<Integer> al=new ArrayList<Integer>();
			al.add(34);
			al.add(56);
			al.add(45);
			al.add(34);
			System.out.println(al);
			System.out.println(al.size());
			al.remove(3);
			System.out.println(al);
			System.out.println(al.size());
			for(int i=0;i<al.size();i++)
			{
				System.out.print(al.get(i)+" ");
			}
			
			
			System.out.println("\nUsing for each loop ");
			for(Integer list :al) {
				System.out.print(list +" ");
			}
			
			System.out.println("\nUsing iterator");
			Iterator itr = al.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			
			// sorting in ascending 
			Collections.sort(al);
			System.out.println("\n" +al);
			// sorting in descending order
			Collections.sort(al,Collections.reverseOrder());
			System.out.println(al);
			//make copy of an array
			ArrayList<Integer> list = new ArrayList<>();
			list.addAll(al);
			System.out.println(list);
			
			//************************************************//
			//Q)Convert array list to String Array
			ArrayList<String> names=new ArrayList<String>();
			names.add("Suvojit");
			names.add("Arpan");
			names.add("Arpita");
			names.add("Pritam");
			String listname[]=names.toArray(new String[names.size()]);
			for(String str:listname)
			{
				System.out.println(str);
			}
		}

	}

