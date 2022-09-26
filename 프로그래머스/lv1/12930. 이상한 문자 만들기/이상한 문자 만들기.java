import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        
        String result = "";
        int idx = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                idx = 0;
            }else if(idx % 2 == 0){
                str[i] = str[i].toUpperCase();
                idx++;
            }else{
                str[i] = str[i].toLowerCase();
                idx++;
            }
            result += str[i];
        }
        
        return result;
    }
}