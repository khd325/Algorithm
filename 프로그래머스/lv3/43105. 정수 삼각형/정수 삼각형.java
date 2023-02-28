class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];

        for(int i = 0; i < dp.length; i++) {
            dp[i] = new int[i+1];
            for(int j = 0; j < i + 1; j++){
                dp[i][j] = triangle[i][j];
            }
        }

        for(int i = triangle.length - 2; i >= 0; i--) {
            for(int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Math.max(dp[i][j] + dp[i+1][j], dp[i][j] + dp[i+1][j+1]);
            }
        }
        
        return dp[0][0];
    }
}