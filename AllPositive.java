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
//  Check if an array contains only positive numbers.
// Task: Given an array, check if all elements are positive numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,sc);
        print(arr);
        boolean pos = true;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]<0) {
                pos = false;
                break ;
            }
        }
        if(pos) System.out.println("All Positive !");
        else System.out.println("Not All positive !");
    }
}
