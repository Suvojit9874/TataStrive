package Assignment;


import java.util.*;

public class ListToHashSet {
  public static void main(String[] args) {
	//remove duplicate element from array

	 List<Integer> a = Arrays.asList(1,2,3,4,5,4,56,7,6,6,8,9);
	  
	 System.out.println(a);
//	 HashSet<Integer> hset =new HashSet<>(); //(if you do using this you have to use loop)
	 //OR   
	 HashSet<Integer> hset =new HashSet<>(a); 
	 //OR
//	 hset.addAll(a);
	System.out.println(hset);
	 
	  
   }
}
