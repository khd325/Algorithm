import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        return Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
                .map(i -> Integer.parseInt(i))
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}