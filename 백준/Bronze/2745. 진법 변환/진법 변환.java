import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int radix = Integer.parseInt(st.nextToken());

        int power = 1;

        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (Character.isAlphabetic(str.charAt(i))) {
                result += (str.charAt(i) - 'A' + 10) * power;
            } else {
                result += (str.charAt(i) - '0') * power;
            }
            power *= radix;
        }

        System.out.println(result);

    }
}
