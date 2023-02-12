package Assignment;


public class Assignment {
    public static  void countVowel(String str){
        int count =0;
        for (int i=0;i<str.length();i++){
           char c=str.toLowerCase().charAt(i);
           if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){         //if char equals to a,e,i,o,u any of then count++
               count++;
           }
        }
        System.out.println("Number of vowel in the string is " +count);
    }

    public static  void occurrence(String str,char target){
        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.toLowerCase().charAt(i)==target){         //if char equals to string i th position the count ++
                count++;
            }
        }
        System.out.println("No of occurrence of given character is " +count);
    }


    public static void palindromeString(String str){
        int n =str.length();
        String palindrome="";

        for (int i = n-1;i>=0;i--){             //here we reverse the string 
           palindrome=palindrome+str.charAt(i);
        }
//        System.out.println(palindrome);
        if (str.equals(palindrome)){
            System.out.println("The string is palindrome");
        }else {
            System.out.println("The string is not palindrome");
        }
    }
    public static void main(String[] args) {
 //Q) wap to count number of vowel in a string
        String str = "Good";
        countVowel(str);

//2) wap to count no of occurrence of given character
        occurrence(str,'o');

//Q3) wap a program to check a string is palindrome or not
        palindromeString("SuuS");
    }
}
