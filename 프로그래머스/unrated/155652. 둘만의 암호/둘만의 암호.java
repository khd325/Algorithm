class Solution {
    
    public String solution(String s, String skip, int index) {
        char[] strs = s.toCharArray();

        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < index; j++) {
                while(true) {
                    strs[i] = (char)((strs[i] + 1 - 'a') % 26 + 'a');
                    if(!skip.contains(String.valueOf(strs[i]))) {
                        break;
                    }
                }
            }
        }
        return String.valueOf(strs);
    }
}