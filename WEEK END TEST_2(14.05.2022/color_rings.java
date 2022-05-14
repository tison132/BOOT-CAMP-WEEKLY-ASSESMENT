
/*
Coded by Kavin J
date: 14.05.2022
description: In a rods(0-9) three colors blue,green and red rings are placed. 
find the number of rods contains all the three colors
*/
import java.util.*;

public class color_rings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        check(s);
    }

    private static void check(String s) {
        int tot = 0;

        for (int i = 0; i <= 9; i++) {
            int r = 0;
            int g = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = (char) (i + '0');
                System.out.print(c);
                char ch1 = s.charAt(j);
                if (ch1 == c) {
                    char ch = s.charAt(j - 1);
                    if (ch == 'r') {
                        r++;
                    }
                    if (ch == 'g') {
                        g++;
                    }
                    if (ch == 'b') {
                        b++;
                    }
                }
            }
            if (r > 0 && g > 0 && b > 0) {
                tot++;
            }
        }
        System.out.print(tot);
    }
}