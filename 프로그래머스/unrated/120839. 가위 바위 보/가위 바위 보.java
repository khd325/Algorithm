import java.util.*;

class Solution {
    public String solution(String rsp) {
        HashMap<Character,String> map = new HashMap<>(){{
            put('2',"0");
            put('0',"5");
            put('5',"2");
        }};
        
        
        String result = "";
        for(int i = 0; i < rsp.length(); i++){
            result += map.get(rsp.charAt(i));
        }
        
        return result;
    }
}