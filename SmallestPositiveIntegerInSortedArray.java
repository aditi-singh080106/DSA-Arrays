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
        boolean flag = false;
        int i = 0 ;
        while(i < n && arr[i] <= 0 ) i++;
         if(arr[i] > 1 ){
               System.out.println("Smallest missing positive number is 1");
               flag = true;
           }
       for(int j = i ; j < n-1 ; j++ ){
           if(flag) break;
          if(arr[j] > 0 && arr[j]+1 != arr[j+1]){
               System.out.println("Smallest missing positive number is : "+(arr[j]+1));
               flag = true;
               break;
           }
        }
        if(!flag) System.out.println("Smallest missing positive number is : "+(arr[n-1]+1));
    }
}
