import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i]-n) < Math.abs(answer - n)){
                answer = array[i];
            }
        }
        
        return answer;
    }
}