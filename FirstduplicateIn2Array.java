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
    public static void main(String[] args) {
// Find the first non-repeating element in an array.
// Task: Given an array, return the first non-repeating element. If all elements are repeating, return -1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        boolean flag = false ;
        int[] arr = new int[n];
        int[] brr = new int[n];
        input(arr,sc);
        input(brr,sc);
        print(arr);
        print(brr);
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i]==brr[j]){
                    System.out.println("First duplicate element is "+arr[i]);
                    flag=true ;
                    break;
                }
            }
            if(flag) break ;
        }
        if(!flag) System.out.println("No duplicates !");
    }
}
