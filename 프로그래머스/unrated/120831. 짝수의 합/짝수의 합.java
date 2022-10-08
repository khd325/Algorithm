import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(2,n).filter(i -> i % 2 == 0).sum();
    }
}