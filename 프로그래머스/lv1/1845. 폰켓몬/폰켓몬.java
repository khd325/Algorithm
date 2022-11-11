import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        
        Set<Integer> s = new HashSet<>();
        
        for(int i : nums){
            s.add(i);
        }
        
        if(s.size() < n) {
            return s.size();
        } else {
            return n;
        }
    }
}