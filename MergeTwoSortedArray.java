import java.util.Scanner;
class Main {
    private static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter the elements of array : ");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.println("Enter the size of 2nd array : ");
        int m = sc.nextInt();
        int[] brr = new int[m] ;
        System.out.println("Enter the elements of array : ");
        for(int i = 0 ; i < m ; i++ ){
            brr[i] = sc.nextInt();
        }
        print(brr);
        int i = 0 , j = 0 , k = 0 ;
        int[] crr = new int[m+n];
        while(i<n && j < m){
            if(arr[i] <= brr[j]) crr[k++] = arr[i++];
            else crr[k++] = brr[j++];
        }
        if(i==n){
            while(j<m) crr[k++] = brr[j++] ;
        }
        if(j==m){
            while(i<n) crr[k++] = arr[i++];
        }
        print(crr);
    }
}
