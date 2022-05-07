import java.util.*;

class rev_vow {
    public static void main(String args[] ) throws Exception {
        Scanner scan =new Scanner(System.in);
        String s=scan.nextLine();
        interchange(s);
    }
    public static void interchange(String s){
        String ans="";
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o' ||ch=='u'){
                list.add(ch);
            }
        }
        int l=list.size()-1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o' ||ch=='u'){
                ans=ans+list.get(l);
                l--;
            }
            else{
                ans=ans+ch;
            }
        }
        System.out.println(ans);
    }
}
