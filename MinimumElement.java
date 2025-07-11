import java.util.Scanner;
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
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        print(arr);
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++ ){
           min = Math.min(arr[i],min);
        }
        System.out.println("Maximum element in array is : "+max);
    }
}
