import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int distance = Integer.MAX_VALUE;

        int[] result = new int[2];
        while (left < sequence.length) {
            if (sum > k || right == sequence.length) {
                sum -= sequence[left++];
            } else {
                sum += sequence[right++];
            }

            if (sum == k && distance > right - left) {
                distance = right - left;
                System.out.println(left + " " + right);
                result[0] = left;
                result[1] = right - 1;
            }
        }
        return result;
    }
}