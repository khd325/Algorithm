import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = IntStream.rangeClosed(0, 9).sum();
        for(int n : numbers){
            sum -= n;
        }
        
        return sum;
    }
}