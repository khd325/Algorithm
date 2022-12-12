import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        score = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int result = 0;
        for (int i = 0; i < score.length; i += m) {
            if(i + m -1 < score.length){
                result += score[i+ m - 1] * m;
            }
        }

        return result;
    }
}