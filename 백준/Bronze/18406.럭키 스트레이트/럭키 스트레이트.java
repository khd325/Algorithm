import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String a = str.substring(0, str.length() / 2);
        String b = str.substring(str.length() / 2, str.length());

        int sum_a = 0;
        int sum_b = 0;

        for (int i = 0; i < a.length(); i++) {
            sum_a += a.charAt(i) - '0';
            sum_b += b.charAt(i) - '0';
        }

        if(sum_a == sum_b) System.out.println("LUCKY");
        if(sum_a != sum_b) System.out.println("READY");

    }
}

