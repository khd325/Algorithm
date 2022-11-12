import java.util.*;

class Solution {
    static boolean[] prime;
    static int cnt = 0;
    static void initPrime() {

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                int j = 2;
                while (i * j < prime.length) {
                    prime[i * j] = false;
                    j++;
                }
            }
        }
    }
    
    static void dfs(int depth, int idx, int[] nums, int[] arr) {
        if (depth == 3) {
            if(prime[Arrays.stream(arr).sum()]) cnt++;
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            arr[depth] = nums[i];
            dfs(depth + 1, i + 1, nums, arr);
        }
    }
    
    public int solution(int[] nums) {
        prime = new boolean[Arrays.stream(nums).sum() + 1];
        Arrays.fill(prime,true);
        initPrime();

        dfs(0,0,nums,new int[3]);

        return cnt;
    }
}