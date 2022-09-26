import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int[] dp = new int[d.length];
        
        Arrays.sort(d);
        dp[0] = d[0];
        
        for(int i = 1; i < dp.length; i++){
            dp[i] = dp[i-1] + d[i];
        }
        return (int)Arrays.stream(dp).filter(i -> i <= budget).count();
    }
}