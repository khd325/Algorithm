import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String result = "";

        int[] x = new int[10];
        int[] y = new int[10];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < X.length(); i++ ){
            x[X.charAt(i) - '0']++;
        }

        for(int i = 0; i < Y.length(); i++ ){
            y[Y.charAt(i) - '0']++;
        }

        for(int i = 9; i >= 0; i--) {
            while(x[i] != 0 && y[i] != 0){
                x[i]--;
                y[i]--;
                sb.append(i);
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