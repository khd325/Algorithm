import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        
        for(int i = 0; i < 10000; i++){
            arrayList.add(new ArrayList<>());
        }
        
        for(int i = 0; i < numlist.length; i++){
                       arrayList.get(Math.abs(n - numlist[i])).add(Math.abs(numlist[i]));
        }
        for(int i = 0; i < 10000; i++){
            Collections.sort(arrayList.get(i),Collections.reverseOrder());
        }
        return arrayList.stream().flatMap(i -> i.stream()).mapToInt(i -> i).toArray();
    }
}