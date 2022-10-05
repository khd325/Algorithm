import java.util.*;

class Solution {
    public int solution(String s) {
        String[] strs = s.split(" ");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < strs.length; i++){
            if(strs[i].equals("Z")){
                if(stack.isEmpty()){
                    continue;
                }else {
                    stack.pop();
                }
            }else {
                stack.push(strs[i]);
            }
        }
        
        return stack.stream().mapToInt(Integer::parseInt).sum();
    }
}