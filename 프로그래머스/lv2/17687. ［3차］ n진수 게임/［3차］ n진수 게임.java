class Solution {
    public String solution(int n, int t, int m, int p) {
        String result = "";
        int num = 0;
        int player = 1;

        while (result.length() < t) {
            String s = Integer.toString(num, n);

            for (int i = 0; i < s.length(); i++) {
                if(result.length() == t) {
                    break;
                }
                if(player == p) {
                    result += String.valueOf(s.charAt(i)).toUpperCase();
                }

                player++;

                if(player > m) {
                    player = 1;
                }
            }
            num++;
        }

        return result;
    }
}