package Assignment;

public class array_problem1 {
	
    public static void negativeNumber(int[] arr){       //this method will print the -ve number
        System.out.print("Negative no are : ");
        for (int i =0;i<arr.length;i++){
            if (arr[i]<0){                          //if any number is less than zero then the no is -ve
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    
    
    public static void countEvenOdd(int [] arr){
        int countEven=0;
        int countOdd=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]%2==0){                   //if a no is divisible by 2 then the number is even 
                countEven++;
            }
            else if (arr[i]%2==1) {
                countOdd++;                      //if a no is not divisible by 2 then the number is odd
            }
        }
        System.out.println("number of even no are " + countEven);
        System.out.println("number of Odd no are " + countOdd);
    }

    
    
    
    
    static void searchElements(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){                        //when target matches the array element then the index will print
                System.out.println(target + " is found at index : " + i);
            }
        }
    }

    
    
    
    
    static void maxNumber(int [] arr){
        int maxValue = Integer.MIN_VALUE;           //here we 1st  consider smallest integer no 
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]>maxValue){                           //if  no is greater than the smallest no then set maxValue = that no  
                maxValue=arr[i];
            }
        }
        System.out.println("max value is  : " +maxValue);
    }
    static void minNumber(int [] arr){
        int minValue = Integer.MAX_VALUE;
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]<minValue){
                minValue=arr[i];
            }
        }
        System.out.println("max value is  : " +minValue);
    }

    
    
    
    
    
    static void reverseArray(int [] arr) {
        int i = 0 , j= arr.length-1;
        while(i<j){
            int a=arr[j];               // i=0 ,j= the length of the array now while i<j , the loop will run and we swap the element and i++ and j--
            arr[j]=arr[i];
            arr[i]=a;
            i++;
            j--;
        }
        System.out.print("Reverse array is : ");
        for (int k:arr){
            System.out.print(k + " ");
        }
    }

    
    
    
    
    
    static void countDuplicate(int []arr){

        int [] freq = new int [10000];                  //we consider a null frequency array
        for(int i =0;i<arr.length;i++){
            freq[arr[i]]++;                 //les at i=0 the no is 5 , the in the freq array ,at 5th index there will be an increment 
        }
        System.out.println();
//        System.out.print("The duplicate nos are : ");
        for (int i =0;i< freq.length;i++){
            if (freq[i]>1){
                System.out.println(i +"  is available in the array " +freq[i] + " times ");
            }
        }
    }
    
    
    public static void main(String[] args) {
        int [] arr = { 1,2,3,-7,-9,4,5,1,3,4,6,7,3,4,3};
        int [] arr1 = { 1,2,3,1,2,3,4,4,64,5,4,2,4,7,2,1,2,5,58,5,2,4,5,4,2,4,4};
 //Q1)Find and print the -ve number of an array
        negativeNumber(arr);

        System.out.println("======================================================================================");
//Q2) Count the number of even and odd elements in an array
       countEvenOdd(arr);
        System.out.println("======================================================================================");
//Q3) WAp a program to search an element in array
        searchElements(arr,3);
        System.out.println("======================================================================================");
//Q4) Wap a program to find max and min element in an array
        maxNumber(arr);
        minNumber(arr);
        System.out.println("======================================================================================");
//Q5) reverse an array
        reverseArray(arr);
        System.out.println("\n ======================================================================================");
//count the duplicate element in an array
        countDuplicate(arr1);

    }
}
