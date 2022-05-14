
/*
Coded by Kavin J
date: 14.05.2022
description: increment and decrement based on the given string
ex: x++ ++x --x ++x for(x++ and ++x) increase value by 1 , for (x-- and --x) decrease value by 1
*/
import java.util.*;

public class inc_val_using_string {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        check(str);

    }

    public static void check(String str) {
        String arr[] = str.split("\\s");
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("+")) {
                x = x + 1;
            }
            if (arr[i].contains("-")) {
                x = x - 1;
            }
        }
        System.out.println(x);
    }
}
