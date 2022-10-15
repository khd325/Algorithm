class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] strs = letter.split(" ");
        
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(strs[i].equals(morse[j])){
                    answer += (char) ('a' + j);
                    break;
                }
            }
        }
        
        
        return answer;
    }
}