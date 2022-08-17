import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String x = st.nextToken();
        String y = st.nextToken();

        int a= rev(x);
        int b= rev(y);

        int result = rev(String.valueOf(a+b));

        System.out.println(result);
    }
}
