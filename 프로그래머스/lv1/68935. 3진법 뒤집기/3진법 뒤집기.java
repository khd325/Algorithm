import java.util.*;

class Solution {
    public int solution(int n) {
        String s = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString(),3);
        
        

    }
}