import java.util.*;

class Solution {
    public int solution(int order) {
        return (int)Arrays.stream(String.valueOf(order).split(""))
            .filter(s -> s.matches("[369]"))
            .mapToInt(Integer::parseInt)
            .count();
    }
}