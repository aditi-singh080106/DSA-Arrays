import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int starcount = 0 , hashcount = 0 ;
      for(int i = 0 ; i < str.length() ; i++ ){
          if(str.charAt(i) == '*') starcount++;
          else                     hashcount++;
      }
      System.out.println(starcount-hashcount);
    }   
}
