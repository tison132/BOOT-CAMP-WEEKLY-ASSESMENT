
/*
Coded by Kavin J
date: 14.05.2022
description: change the order of given sentence according to given number in the word
ex: love2 java3 i1 -> output->i love java
*/
import java.util.*;

class order_the_sentence {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        check(str);
    }

    public static void check(String str) {
        String array[] = new String[100];
        String ans = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int n = ch - '0';
                array[n] = ans;
                ans = "";
                count++;
            } else {
                if (ch != ' ') {
                    ans = ans + ch;
                }
            }
        }

        String val = "";
        for (int i = 1; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
