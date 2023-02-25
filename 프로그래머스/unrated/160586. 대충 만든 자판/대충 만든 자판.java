import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            String str = keymap[i];

            for (int j = 0; j < str.length(); j++) {
                Character c = str.charAt(j);
                if (map.containsKey(c)) {
                    Integer idx = map.get(c);
                    if (idx >= j + 1) map.put(c, j + 1);
                } else {
                    map.put(c, j + 1);
                }
            }
        }

        for(int i = 0; i < targets.length; i++) {
            String str = targets[i];
            int sum = 0;
            for(int j = 0; j < str.length(); j++){
                Character c = str.charAt(j);
                if(!map.containsKey(c)) {
                    sum = - 1;
                    break;
                }
                sum += map.get(c);
            }

            answer[i] = sum == - 1 ? -1 : sum;
        }

        return answer;
    }
}