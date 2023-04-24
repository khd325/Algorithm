import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int radix = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int mod = n % radix;

            if (mod > 9) {
                sb.append((char)(mod + 'A' - 10));
            }else {
                sb.append(mod);
            }

            n /= radix;

        }

        System.out.println(sb.reverse());

    }
}
