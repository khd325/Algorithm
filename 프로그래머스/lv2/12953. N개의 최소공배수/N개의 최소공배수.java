import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int num = Arrays.stream(arr).max().getAsInt();
        while (true) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if(num % arr[i] == 0) {
                    cnt++;
                }
            }
            if(cnt == arr.length){
                break;
            }
            num++;
        }
        
        return num;
    }
}