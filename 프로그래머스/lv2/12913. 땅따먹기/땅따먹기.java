import java.util.*;

class Solution {
    int solution(int[][] land) {
        int[][] dp = new int[land.length][4];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;

                    dp[i][j] = Math.max(dp[i - 1][k] + land[i][j], dp[i][j]);
                }
            }
        }
        int result = Arrays.stream(dp[dp.length- 1]).max().getAsInt();

        return result;
    }
}