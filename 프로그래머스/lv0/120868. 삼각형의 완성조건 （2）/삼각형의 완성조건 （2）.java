import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int arrMax = Math.max(sides[0], sides[1]);
        int arrMin = Math.min(sides[0], sides[1]);
        HashSet<Integer> set = new HashSet<>();

        for(int i = 1; i <= arrMax; i++){
            if(i + arrMin > arrMax){
                set.add(i);
            }
        }

        //arrMax + arrMin > x
        for(int i = arrMax+1; i < arrMax + arrMin; i++){
            if(i < arrMax+ arrMin){
                set.add(i);
            }
        }

        return set.size();
    }
}