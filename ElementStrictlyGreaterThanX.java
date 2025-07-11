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
        System.out.println("Enter value of x : ");
        int x = sc.nextInt();
        int count = 0 ;
        for(int ele : arr){
            if(ele>x) count++;
        }
        System.out.println("total number of elements greater then x : "+count);
    }
}
