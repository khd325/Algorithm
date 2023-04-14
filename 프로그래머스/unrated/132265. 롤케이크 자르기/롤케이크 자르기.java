import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            map1.put(topping[i], map1.getOrDefault(topping[i], 0) + 1);
        }
        int result = 0;
        for (int i = 0; i < topping.length; i++) {
            int t = topping[i];

            map2.put(t, map2.getOrDefault(t, 0) + 1);
            map1.put(t, map1.get(t) - 1);

            if(map1.get(t) == 0){
                map1.remove(t);
            }
            if(map1.size() == map2.size()) {
                result++;
            }
        }

        return result;
    }
}