// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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
        for(int ele : arr ){
            if(set.contains(ele)){
                System.out.println("Duplicate element is : "+ele);
                break;
            }
            else set.add(ele);
        }
    }
}
