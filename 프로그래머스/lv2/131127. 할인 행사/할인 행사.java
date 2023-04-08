import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        HashMap<String,Integer> hs = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            hs.put(want[i], i);
        }

        int[] temp = new int[want.length];

        for (int i = 0; i <= discount.length - 10; i++) {
            Arrays.fill(temp, 0);

            for (int j = i; j < i + 10; j++) {
                if (hs.containsKey(discount[j])) {
                    temp[hs.get(discount[j])]++;
                }else {
                    break;
                }
            }

            boolean flag = true;
            for(int j = 0; j < number.length; j++){
                if(number[j] != temp[j]) {
                    flag = false;
                }
            }

            if(flag) result++;
        }

        return result;
    }
}