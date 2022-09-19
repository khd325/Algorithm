import java.util.*;

class Solution {
    public boolean solution(int x) {
        int sum = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::valueOf).sum();
        
        return x % sum == 0;
    }
}