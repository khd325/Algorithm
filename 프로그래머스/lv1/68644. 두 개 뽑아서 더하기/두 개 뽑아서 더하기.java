import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> s = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!s.contains(sum)){
                    s.add(sum);
                }
            }
        }
        return s.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}