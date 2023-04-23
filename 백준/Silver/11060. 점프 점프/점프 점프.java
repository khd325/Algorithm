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
        int n = Integer.parseInt(br.readLine());


        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 0; i < n; i++){
            if(dp[i] == Integer.MAX_VALUE) continue;

            for(int j = 0; j <= arr[i]; j++){
                if(i + j >= n) break;
                dp[i+j] = Math.min(dp[i+j], dp[i] + 1);
            }
        }


        if(dp[n-1] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n-1]);
        }


    }
}
