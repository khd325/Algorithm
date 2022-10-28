import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int start = 0;

        while (true) {
            int sum = IntStream.range(start, start + num).sum();
            
            if (sum == total) {
                int[] result = IntStream.range(start, start + num).toArray();
                return result;
            } else if (sum < total) {
                start++;
            } else {
                start--;
            }
        }
    }
}