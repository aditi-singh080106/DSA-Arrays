import java.util.HashMap;
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
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element in array :");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        print(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++ ){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]) + 1 ;
                map.put(arr[i],freq);
            }
            else map.put(arr[i],1);
        }
        for(int ele : arr){
            if(map.get(ele) == 1 ){
                System.out.println("First non-repeating element is : "+ele);
                break;
            }
        }
    }
}
