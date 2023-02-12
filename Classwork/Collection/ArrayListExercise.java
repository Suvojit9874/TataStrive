package Collection;

import java.util.*;
public class ArrayListExercise {
	public static void main(String[] args) {
//			ArrayList<Integer>  al = new ArrayList<>();
//			al.add(1);
//			al.add(3);
//			al.add(5);
//			al.add(8);
//			al.add(10);
//			al.add(4);
//			al.add(6);
//			for(int j :al) {
//				if (j%2==0) {
//					System.out.print(j+" ");
//				}
//			}
		// shortcut
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8,9);
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
		Integer SumResult =numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(SumResult);
		
		int sum1 =numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
	}
}
