import java.util.Scanner;
class Main {
    public static void input(int[] arr, Scanner sc){
        System.out.println("Enter values in array :");
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    // Find the sum of the elements at odd indices.
// Task: Given an array, find the sum of the elements that are located at odd indices.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,sc);
        print(arr);
        int oddSum = 0 ;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(i%2 != 0) {
                oddSum+=arr[i];
            }
        }
        System.out.println("Sum of all indices :"+oddSum);
    }
}
