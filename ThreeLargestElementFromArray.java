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
        int max = Integer.MIN_VALUE , smax = Integer.MIN_VALUE , tmax = Integer.MIN_VALUE ;
        for(int ele : arr ){
            if(ele > max){
                tmax = smax ;
                smax = max ;
                max = ele ;
            }
            else if ( ele < max && ele > smax ) {
                tmax = smax;
                smax = ele ;
            }
            else if ( ele < smax && ele > tmax) tmax = ele ;
        }
        System.out.println("1st Maximum : "+max);
        System.out.println("2nd Maximum : "+smax);
        System.out.println("3rd Maximum : "+tmax);
    }
}
