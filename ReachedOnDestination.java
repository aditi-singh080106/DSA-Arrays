import java.util.Scanner;
class Main {
    public static void input(int[] arr , Scanner sc){
        System.out.println("Enter values in array :- ");
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    public static void print(int[] arr ){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,sc) ;
        print(arr);
        int i = 0 ; 
        while(i<n){
            if(i>=n-1){
                System.out.println("True");
                break;
            }
            else if(arr[i]==0 && i <n-1){
                System.out.println("False");
                break;
            }
            else i+=arr[i];
        }
    }
}
