import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> s = new Stack<>();
        int[] result = new int[numbers.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < numbers.length; i++) {
            if (s.isEmpty()) {
                s.push(i);
            } else {
                while (!s.isEmpty() && numbers[s.peek()] < numbers[i]) {
                    result[s.pop()] = numbers[i];
                }
                s.push(i);
            }
        }

        return result;
    }
}