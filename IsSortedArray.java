import java.util.Scanner;
import java.util.HashSet;
class Main {
    public static void print(int[] arr){
        for(int i = 0 ; i  < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        print(arr);
        boolean isSorted = true ;
        for(int i = 0 ; i < n-1 ; i++ ){
            if(arr[i] > arr[i+1]){
                System.out.println("Given array is not Sorted..!");
                isSorted = false ;
                break ;
            } 
        }
        if(isSorted) System.out.println("Given array is Sorted..!");
    }
}
