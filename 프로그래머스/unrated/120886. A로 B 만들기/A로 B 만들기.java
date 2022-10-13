import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        String a = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String b = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        
        return a.equals(b) ? 1 : 0;
        
    }
}