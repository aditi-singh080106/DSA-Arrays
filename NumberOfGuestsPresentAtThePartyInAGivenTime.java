import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the duration of the party :");
      int n = sc.nextInt();
      int[] e = new int[n];
      int[] l = new int[n];
      System.out.println("Enter the number of person entering & leaving in the party :");
      for(int i = 0 ; i < n ; i++ ){
          e[i] = sc.nextInt();
          l[i] = sc.nextInt();
      }
    //  prefix sum 
      for(int i = 1 ; i < n ; i++ ){
        e[i] += e[i-1];
        l[i] += l[i-1];
      }
      System.out.println("Enter the duration of the party to know nuber of guests present at the party :");
    int m = sc.nextInt();
    System.out.println("Total number of guests present is :"+(e[m-1]-l[m-1]));
    }
}
