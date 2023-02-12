package Collection;

import java.util.ArrayList;

public class StudentList {
		public static void main(String[] args) {
			ArrayList<StudentClass> students =new ArrayList<>();
//			StudentClass s1 =new StudentClass(101, "Suvojit", "Hooghly");
//			StudentClass s2 =new StudentClass(102, "Argha", "kolkata");
//			StudentClass s3 =new StudentClass(103, "Debu", "pune");
//			students.add(s1);
//			students.add(s2);
//			students.add(s3);
			
			//using Annonymous class 
			students.add(new StudentClass(101, "Suvojit", "Hooghly"));
			students.add(new StudentClass(102, "Argha", "kolkata"));
			students.add(new StudentClass(103, "Debu", "pune"));
		    for(StudentClass str:students) {
		    	System.out.println("ID : " +str.getId());
		    	System.out.println("name : " +str.getName());
		    	System.out.println("city : " +str.getCity());
		    	System.out.println("-----------------------------------------");
		    }
		}
}
