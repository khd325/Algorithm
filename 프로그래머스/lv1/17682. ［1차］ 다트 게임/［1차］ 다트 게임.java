import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        dartResult = dartResult.replace("10", "Z");
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == 'Z') {
                stack.push(10);
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') {
                    stack.push((int) Math.pow(stack.pop(), 2));
                } else if (c == 'T') {
                    stack.push((int) Math.pow(stack.pop(), 3));
                }
            } else {
                if (c == '*') {
                    int temp = stack.pop();
                    if (!stack.isEmpty()) {
                        stack.push(stack.pop() * 2);
                    }
                    stack.push(temp * 2);
                } else if (c == '#') {
                    stack.push(stack.pop() * - 1);
                }
            }
        }
        while(!stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;

    }
}