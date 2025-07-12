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
        // // Plindrome 
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter the elements of array : ");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        boolean flag = true ;
        int i = 0 , j = n-1 ;
        while(i<j){
            if(arr[i] != arr[j]){
                flag = false ;
                break;
            }
            i++;j--;
        }
        if(flag) System.out.println("Array is Plindrome..!");
        else System.out.println("Array is not Plindrome..!");
        
    }
}
