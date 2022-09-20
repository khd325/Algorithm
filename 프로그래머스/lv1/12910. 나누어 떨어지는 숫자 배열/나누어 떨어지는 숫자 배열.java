import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        
        return result.length != 0 ? result : new int[]{-1};
    }
}