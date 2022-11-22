class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int cnt = 0;
        while (!s.equals("1")) {
            cnt++;
            int len = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                } else {
                    len++;
                }
            }
            s = Integer.toBinaryString(len);
        }
        
        return new int[]{cnt,zero};
    }
}