import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOfRange(emergency,0,emergency.length);
        
        int n = emergency.length;
        
        Arrays.sort(copy);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : copy){
            map.put(i,n--);
        }
        
        return Arrays.stream(emergency).map(map::get).toArray();
    }
}