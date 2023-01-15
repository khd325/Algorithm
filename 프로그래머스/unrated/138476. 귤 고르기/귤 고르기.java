import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());

        entries.sort((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey()));

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : entries) {

            result++;

            Integer cnt = entry.getValue();
            k -= cnt;
            if(k <= 0){
                break;
            }
        }
        
        return result;
    }
}