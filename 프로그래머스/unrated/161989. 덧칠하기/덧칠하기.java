class Solution {
    public int solution(int n, int m, int[] section) {
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < section.length; i++) {
            if (idx <= section[i]) {
                idx = section[i] + m;
                cnt++;
            }
        }
        return cnt;
    }
}