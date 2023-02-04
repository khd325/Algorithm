import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int[] temp = new int[elements.length * 2];
        
        for(int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
            temp[i + elements.length] = elements[i];
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= elements.length; i++){
            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                for(int k = j; k < j + i; k++) {
                    sum += temp[k];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}