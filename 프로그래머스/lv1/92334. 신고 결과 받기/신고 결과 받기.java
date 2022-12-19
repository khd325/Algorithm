import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        HashMap<String, Integer> userIdx = new HashMap<>();
        int[] result = new int[id_list.length];
        int[] cnt = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            arr.add(new ArrayList<>());
            userIdx.put(id_list[i], i);
        }

        for (int i = 0; i < report.length; i++) {
            String[] s = report[i].split(" ");
            String a = s[0];
            String b = s[1];

            if(!arr.get(userIdx.get(a)).contains(b)) {
                arr.get(userIdx.get(a)).add(b);
                cnt[userIdx.get(b)]++;
            }
        }
        for(int i = 0; i < id_list.length; i++){
            int temp = 0;
            for(int j = 0; j < arr.get(i).size(); j++){
                if(cnt[userIdx.get(arr.get(i).get(j))] >= k) {
                    temp++;
                }
            }
            result[i] = temp;
        }

        return result;
    }
}