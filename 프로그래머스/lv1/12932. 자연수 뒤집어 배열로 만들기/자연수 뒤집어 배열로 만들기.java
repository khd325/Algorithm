import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        Stream<Integer> intStream = Arrays.stream(String.valueOf(n).split("")).map(i -> Integer.valueOf(i));
        List<Integer> collect = intStream.collect(Collectors.toList());
        Collections.reverse(collect);

        return collect.stream().mapToInt(Integer::intValue).toArray();
    }
}