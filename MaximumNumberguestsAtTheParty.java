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
    int max = 0 ;
    int totalg = 0 ;
    for(int i = 0 ; i < n ; i ++ ){
        totalg+=e[i];
        totalg-=l[i];
        max = Math.max(max,totalg);
    }
    System.out.println(max);
    sc.close();
    }
