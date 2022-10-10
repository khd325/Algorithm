class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] strs = my_string.split("");
        
        String temp = strs[num1];
        String a = strs[num2];
        
        strs[num1] = a;
        strs[num2] = temp;
        
        String result = "";
        
        for(int i = 0; i < strs.length;i++){
            result += strs[i];
        }
        
        return result;
    }
}