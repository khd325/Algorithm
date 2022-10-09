class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");
        
        for(int i = 0; i < str.length; i++){
            sb.append(str[i].repeat(n));
        }
        
        return sb.toString();
    }
}