package TataStrive.Classwork.String;

public class String2 {
    public static void main(String[] args) {
//		String str="Javaprogramming";
//		String str1="javaprogramming";
//		String str2="java"+"programming";
//		String str4="Bond";
//		String str5="My name is"+str4;
//		String str6="My name is bond";
        //	String str7=new String("My name is bond");
//		String s1="computer";
//		String s2="computer";
//		String s3=new String("computer");
//		System.out.println("Result1: "+(s1==s2));//true
//		System.out.println("Result2: "+(s1.equals(s2)));//true
//		System.out.println("Result3: "+(s1==s3));//false
//		System.out.println("Result4: "+(s1.equals(s3)));//true
//		String s1=new String("Computer");
//		String s2=s1.toUpperCase();
//		System.out.println(s2);
//		String s3=s1.toLowerCase();
//		System.out.println(s3);
//		String name="good morning";
//		char ch=name.charAt(5);
//		System.out.println(ch);
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        String str5=s1.concat(s2).concat(s3).concat(s4).concat(s5);
        System.out.println(str5);
        String name="good morning";
        System.out.println(name.isEmpty());
        System.out.println(name.startsWith("hello"));
        System.out.println(name.indexOf('r'));

    }
}
