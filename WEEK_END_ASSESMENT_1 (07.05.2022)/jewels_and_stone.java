import java.util.*;
class jewels_and_stone {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String j = scan.next();
        String s=  scan.next();
        countval(j,s);
    }
    public static void countval(String jew,String s){
        int count=0;
        for(int i=0;i<jew.length();i++){
            char ch1=jew.charAt(i);
            for(int j=0;j<s.length();j++){
              char ch2=s.charAt(j);
              if(ch1==ch2){
                  count++;
              }
            }
        }
        System.out.println(count);
    }
}

