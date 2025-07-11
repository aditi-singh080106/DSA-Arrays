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
        // Second max in 1 pass 
        int max = Integer.MIN_VALUE , smax = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++ ){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > smax)  smax = arr[i];
            // max = Math.max(arr[i],max);
            // if(arr[i] > smax && arr[i] != max)  smax = arr[i];
        }
        System.out.println("Maximum element in array is : "+max);
        System.out.println("Second Maximum element in array is : "+smax);
    }
}
