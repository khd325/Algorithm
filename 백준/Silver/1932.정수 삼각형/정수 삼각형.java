import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < i + 1; j++){
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                int leftUp,rightUp;
                if(j == 0) leftUp = 0;
                else leftUp = dp[i-1][j-1];

                if(j == i) rightUp = 0;
                else rightUp = dp[i-1][j];

                dp[i][j] = dp[i][j] + Math.max(leftUp,rightUp);
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            result = Math.max(result,dp[n-1][i]);
        }

        System.out.println(result);
    }
}