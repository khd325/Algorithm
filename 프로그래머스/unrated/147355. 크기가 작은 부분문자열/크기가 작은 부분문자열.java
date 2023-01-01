class Solution {
    public int solution(String t, String p) {
        int result = 0;
        long num = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= num) {
                result++;
            }
        }
        
        return result;
    }
}