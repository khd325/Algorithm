class Solution {
    public int solution(String s) {
        int result = 0;
        String[] strs = s.split("");

        String pre = strs[0];
        int same = 1;
        int diff = 0;

        for(int i = 1; i < strs.length; i++){
            String cur = strs[i];

            if(pre.equals(cur)) {
                same++;
            }else {
                diff++;
            }

            if(same == diff) {
                result++;
                if(i != strs.length - 1){
                    pre = strs[i+1];
                }
                same = 0;
                diff = 0;
            }
        }

        if(diff != 0 || same != 0){
            result++;
        }

        return result;
    }
}