import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       int answer = 0;
        int[] state = new int[n + 1];
        Arrays.fill(state, 1);
        state[0] = -1;
        for (int i = 0; i < lost.length; i++) {
            state[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            state[reserve[i]]++;
        }

        for (int i = 0; i < state.length; i++) {
            if (state[i] == 0 && state[i - 1] == 2) {
                state[i] = 1;
                state[i - 1] = 1;
            } else if (i < state.length - 1 && state[i] == 0 && state[i + 1] == 2) {
                state[i + 1] = 1;
                state[i] = 1;
            }
        }

        for (int i = 0; i < state.length; i++) {
            if (state[i] > 0) {
                answer++;
            }
        }
        return answer;
    }
}