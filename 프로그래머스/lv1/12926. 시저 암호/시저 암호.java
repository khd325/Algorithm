import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String result = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                result += c;
            }else if (Character.isLowerCase(c)){
                result += (char)((c - 'a' + n) % 26 + 'a');
            }else if (Character.isUpperCase(c)){
                result += (char)((c - 'A' + n) % 26 + 'A');
            }
        }
        return result;
    }
}