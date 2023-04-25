import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int[] dp = new int[100001];

        Arrays.fill(dp, 100_000_0);
        dp[n] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == m) {
                break;
            }

            if (now * 2 >= 0 && now * 2 <= 100000) {
                if (dp[now] < dp[now * 2]) {
                    dp[now * 2] = dp[now];
                    q.add(now * 2);
                }
            }

            if (now - 1 >= 0 && now - 1 <= 100000) {
                if (dp[now] + 1 < dp[now - 1]) {
                    dp[now - 1] = dp[now] + 1;
                    q.add(now - 1);
                }
            }

            if (now + 1 >= 0 && now + 1 <= 100000) {
                if (dp[now] + 1 < dp[now + 1]) {
                    dp[now + 1] = dp[now] + 1;
                    q.add(now + 1);
                }
            }
        }

        System.out.println(dp[m]);


    }
}
