import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of monkey :");
      int n = sc.nextInt();
      System.out.println("Enter number of banana that a monkey can eat :");
      int k = sc.nextInt();
      System.out.println("Enter number of peanut that a monkey can eat :");
      int j = sc.nextInt();
      System.out.println("Enter total  number of banana avialabel to eat :");
      int m = sc.nextInt();
      System.out.println("Enter total  number of peanut avialabel to eat :");
      int p = sc.nextInt();
      if(n<0 || k<=0||j<=0||p<0||m<0){
          System.out.println("Invalid input");
      }
      else{
          int totalnummonkeyeatbanana = m/k ;
          int bleft = m%k ;
          int totalnummonkeyeatpeanut = p/j;
          int pleft = p%j ;
          int ans = n- (totalnummonkeyeatbanana+totalnummonkeyeatpeanut) ;
          if(bleft!= 0 || pleft!= 0) ans -- ;
          System.out.println(ans);
      }
    }   
}
