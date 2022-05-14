
/*
Coded by Kavin J
date: 14.05.2022
description: convert the given string to goal 
given string : g()(al) ****g->g,()->o ,(al)->al****
*/
import java.util.*;

public class goal {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        check(str);
    }

    public static void check(String str) {
        String ans = "";
        char ch1;
        char ch2;
        for (int i = 0; i < str.length() - 1; i++) {
            ch1 = str.charAt(i);
            ch2 = str.charAt(i + 1);
            if (ch1 == '(' && ch2 == ')') {
                ans = ans + "o";
            } else if (ch1 != '(' && ch1 != ')') {
                ans = ans + ch1;
            }
        }
        if (str.charAt(str.length() - 1) != '(' && str.charAt(str.length() - 1) != ')') {
            ans = ans + str.charAt(str.length() - 1);
        }
        System.out.println(ans);
    }
}
