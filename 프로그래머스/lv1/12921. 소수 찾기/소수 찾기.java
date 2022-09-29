import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[1] = false;
        
        for(int i = 2; i < Math.sqrt(n) + 1; i++){
            if(prime[i]){
                int j = 2;
                while(i * j <= n){
                    prime[i*j] = false;
                    j++;
                }
            }
        }
        
        for(int i = 2; i <= n; i++){
            if(prime[i]) answer++;
        }
        return answer;
    }
}