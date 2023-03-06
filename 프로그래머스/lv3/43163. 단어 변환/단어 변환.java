import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer;
    
    public static int dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            return cnt - 1;
        }
        for (int i = 0; i < words.length; i++) {
            int temp = 0;
            for (int j = 0; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) temp++;
            }
            if(temp != 1) continue;

            if(!visited[i]) {
                visited[i] = true;
                answer = Math.min(answer, dfs(words[i], target, words, cnt + 1));
                visited[i] = false;
            }
        }

        return answer;
    }
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = 51;

        dfs(begin, target, words, 1);

        return answer == 51 ? 0 : answer;
    }
}