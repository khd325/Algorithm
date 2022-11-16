import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String result = "";

        int[] cnt = new int[10];
        

        StringBuilder sb = new StringBuilder();
        for(int i = 0;  i <= 9; i++){
            final int num = i;
            int xCnt = (int)Arrays.stream(X.split("")).filter(s -> Integer.valueOf(s) == num).count();
            int yCnt = (int)Arrays.stream(Y.split("")).filter(s -> Integer.valueOf(s) == num).count();
            
            cnt[i] = Math.min(xCnt,yCnt);
        }

        for(int i = 9; i >= 0; i--) {
            if(cnt[i] != 0){
                sb.append(String.valueOf(i).repeat(cnt[i]));
            }
        }
        result = sb.toString();

        if(result.equals("")){
            return "-1";
        }else if (result.startsWith("0")){
            return  "0";
        } else {
            return result;
        }
    }
}