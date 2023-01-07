package TataStrive.Classwork.Array;

public class Sorting_array {
    public static void main(String[] args) {
        int [] arr = {1,7,8,6,4,5,3};
        for (int i=0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int a=arr[j];
                    arr[j]=arr[i];
                    arr[i]=a;
                }
            }
        }
        for (int j:arr){
            System.out.print(j+ " ");
        }
    }
}
