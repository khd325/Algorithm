import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String result = "";
        
        if(Character.isLetterOrDigit(s.charAt(0))) {
            result += s.substring(0,1).toUpperCase();
        }else {
            result += " ";
        }
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == ' ' && Character.isLetterOrDigit(s.charAt(i))) {
                result += s.substring(i,i+1).toUpperCase();
            } else {
                result += s.charAt(i);
            }
        }
        
        return result;
        
    }
}