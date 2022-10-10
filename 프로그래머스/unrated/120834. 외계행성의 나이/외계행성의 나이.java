class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            result += (char)(c - '0' + 'a');
        }
        
        return result;
    }
}