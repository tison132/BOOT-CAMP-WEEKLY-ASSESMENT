import java.util.*;

public class samp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "r0b0g0r1b1g1r2g2b2";
        check(str);
    }

    private static void check(String str) {
        int arr_R[] = new int[10];
        int arr_B[] = new int[10];
        int arr_G[] = new int[10];
        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            int n = ch1 - '0';
            if (ch == 'r') {
                arr_R[n] += 1;
            }
            if (ch == 'g') {
                arr_B[n] += 1;
            }
            if (ch == 'b') {
                arr_G[n] += 1;

            }
        }
        int tot = 0;
        for (int i = 0; i < 10; i++) {
            if (arr_B[i] >= 1 && arr_G[i] >= 1 && arr_R[i] >= 1) {
                tot++;
            }
        }
        System.out.println(tot);
    }
}
