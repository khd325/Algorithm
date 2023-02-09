import java.util.*;

class Solution {
    
    static int calculate(String str, int m) {
        String[] strs = str.split("\\.");
        int year = Integer.parseInt(strs[0]);
        int month = Integer.parseInt(strs[1]) + m;
        int day = Integer.parseInt(strs[2]);

        return year * 28 * 12 + month * 28 + day - 1;

    }
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] split = today.split("\\.");
        int today_ = (Integer.parseInt(split[0]) * 12 * 28) + (Integer.parseInt(split[1]) * 28) + Integer.parseInt(split[2]);

        List<Integer> list = new ArrayList<>();

        HashMap<String, Integer> termsMap = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] s = terms[i].split(" ");
            termsMap.put(s[0], Integer.parseInt(s[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int days = calculate(privacy[0], termsMap.get(privacy[1]));

            if(today_ > days) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}