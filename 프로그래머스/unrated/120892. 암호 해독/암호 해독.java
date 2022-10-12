class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = code - 1;
        
        while(idx < cipher.length()){
            answer += cipher.charAt(idx);
            idx+=code;
        }
        
        return answer;
    }
}