import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] dp = new int[n];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                dp[i] = arr[i];
            }

            for(int i = 1; i < n; i++) {
                if(dp[i-1] + arr[i] > arr[i]) {
                    dp[i] = dp[i-1] + arr[i];
                }
            }

            System.out.println(Arrays.stream(dp).max().getAsInt());
        }
    }
}
