import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new HashSet<>(){{
            add("a"); add("e"); add("i"); add("o"); add("u");
        }};
        
        return Arrays.stream(my_string.split("")).filter(s -> !set.contains(s)).collect(Collectors.joining());
    }
}