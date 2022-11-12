import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            put(1,0);
            put(2,0);
            put(3,0);
        }};

        for(int i = 0; i < answers.length;i++){
            if(answers[i] == one[i%5]){
                map.put(1, map.get(1)+1);
            }
            if(answers[i] == two[i%8]){
                map.put(2, map.get(2)+1);
            }
            if(answers[i] == three[i%10]){
                map.put(3, map.get(3)+1);
            }
        }


        Integer max = map.values().stream().max((e1, e2) -> e1 - e2).get();

        int[] result = map.entrySet().stream().
                filter(e -> e.getValue().equals(max))
                .mapToInt(Map.Entry::getKey)
                .sorted()
                .toArray();
        return result;
    }
}