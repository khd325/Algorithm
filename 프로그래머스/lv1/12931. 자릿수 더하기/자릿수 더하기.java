import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        Stream<String> stream = Arrays.stream(String.valueOf(n).split("")); 
    
        return stream.map(Integer::valueOf).reduce(0, (a, b) -> a + b);
      
    }
}