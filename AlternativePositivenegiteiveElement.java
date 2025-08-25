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
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int k = 0 , j = 0 ;
        for(int i = 0 ; i <n ; i++){
            if(arr[i] >= 0) pos[k++] = arr[i];
            else neg[j++]= arr[i];
        }
        // merging both array alternatively
        k = 0 ;
        j = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(i%2==0) arr[i] = pos[k++];
            else arr[i] = neg[j++];
        }
        print(arr);
    }
}
