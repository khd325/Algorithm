import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String str = Integer.toBinaryString(n);

            sb = new StringBuilder(str);

            str = sb.reverse().toString();


            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    System.out.print(j + " ");
                }
            }
        }
    }
}