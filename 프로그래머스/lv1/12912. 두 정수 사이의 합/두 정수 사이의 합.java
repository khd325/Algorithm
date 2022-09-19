import java.util.stream.*;

class Solution {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(a > b ? b : a, a > b ? a : b).sum();        
    }
}