import java.util.*;

class Solution {
    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;

                if(c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.substring(0, 1);
            if(check(s)) answer++;
        }

        return answer;
    }
}