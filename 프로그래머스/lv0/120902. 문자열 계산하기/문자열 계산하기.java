import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        Queue<Integer> nums = new LinkedList<>();
        Queue<Character> operators = new LinkedList<>();

        for(int i = 0; i < str.length; i++){
            if(Character.isDigit(str[i].charAt(0))){
                nums.add(Integer.parseInt(str[i]));
            }else {
                operators.add(str[i].charAt(0));
            }
        }


        int result = nums.poll();
        while(!operators.isEmpty()){
            char c = operators.poll();
            if(c == '+'){
                result += nums.poll();
            } else {
                result -= nums.poll();
            }
        }
        return result;
    }
}