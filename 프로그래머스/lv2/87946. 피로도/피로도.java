import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer;

    static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        
        answer = Math.max(answer,depth);
    }
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        dfs(0,k,dungeons);
        return answer;
    }
}