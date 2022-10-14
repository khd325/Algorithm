class Solution {
    public String solution(String s) {
        int[] cnt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        String result = "";

        for(int i = 0; i < 26; i++){
            if(cnt[i] == 1){
                result += (char) ('a' + i);
            }
        }
        
        return result;
    }
}