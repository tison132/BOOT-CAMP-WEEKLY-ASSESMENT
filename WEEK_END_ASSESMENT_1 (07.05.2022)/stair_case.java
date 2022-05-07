import java.util.*;
class stair_case {
    public static void main(String args[] ) throws Exception {
       Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
       System.out.println(check(n+1));
    }
    public static int check(int n){
      if(n<=1){
          return n;
      }
      return check(n-1)+check(n-2);
    }
}

