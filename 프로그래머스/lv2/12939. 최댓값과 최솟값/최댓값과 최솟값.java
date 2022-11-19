class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        
        for(int i = 1; i < str.length; i++){
            int n = Integer.parseInt(str[i]);
            if(n > max) max = n;
            if(n < min) min = n;
        }
        
        String result = min + " " + max;
        return result;
    }
}