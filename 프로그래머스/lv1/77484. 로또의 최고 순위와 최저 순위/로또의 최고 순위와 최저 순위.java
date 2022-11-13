import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int zeroCnt = (int) Arrays.stream(lottos).filter(i -> i == 0).count();

        int cnt = 0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[i] == lottos[j]) {
                    cnt++;
                }
            }
        }

        return new int[]{rank[zeroCnt + cnt], rank[cnt]};
    }
}