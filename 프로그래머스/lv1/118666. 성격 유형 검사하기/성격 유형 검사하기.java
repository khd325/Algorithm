import java.util.*;

class Solution {
    static int[] scores = {3, 2, 1, 0, 1, 2, 3};
    
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('R', 0);
            put('T', 0);
            put('C', 0);
            put('F', 0);
            put('J', 0);
            put('M', 0);
            put('A', 0);
            put('N', 0);
        }};

        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);

            int c = choices[i];

            if (c < 4) {
                map.put(a, map.get(a) + scores[c - 1]);
            } else if (c > 4) {
                map.put(b, map.get(b) + scores[c - 1]);
            }
        }

        StringBuilder sb = new StringBuilder();


        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T')
                .append(map.get('C') >= map.get('F') ? 'C' : 'F')
                .append(map.get('J') >= map.get('M') ? 'J' : 'M')
                .append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return sb.toString();
    }
}