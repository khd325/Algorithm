import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String s) {
//         String answer = "";
//         String[] str = s.split("");

//         Arrays.sort(str);
     
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < str.length; i++){
//             sb.append(str[i]);
//         }
        
//         answer = sb.reverse().toString();
//         return answer;
        String[] str = s.split("");
        return Arrays.stream(str).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
}