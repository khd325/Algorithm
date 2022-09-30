import java.util.*; 

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted(
            (e1,e2) -> {
                if(e1.charAt(n) == e2.charAt(n)){
                    return e1.compareTo(e2);
                }
                return e1.charAt(n) - e2.charAt(n);
            }
        ).toArray(String[]::new);   
     
    }
}