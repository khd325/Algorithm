import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int p = 2;

        int result = 0;
        for (int i = 0; i < n; i++) {
            int temp = p + (p - 1);
            result = temp * temp;

            p = temp;
        }
        System.out.println(result);

    }
}
