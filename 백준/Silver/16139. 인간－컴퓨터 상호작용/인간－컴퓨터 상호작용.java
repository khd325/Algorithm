import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int[][] dp = new int[26][str.length()];

        dp[str.charAt(0) - 'a'][0] = 1;
        for (int i = 1; i < str.length(); i++) {
            dp[str.charAt(i) - 'a'][i]++;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < str.length(); j++) {
                dp[i][j] = dp[i][j] + dp[i][j - 1];
            }
        }
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            char c = st.nextToken().charAt(0);

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left == 0) {
                sb.append(dp[c - 'a'][right]).append("\n");
            } else {
                sb.append(dp[c - 'a'][right] - dp[c - 'a'][left - 1]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
