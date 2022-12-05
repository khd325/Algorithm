class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        int idx = 0;

        for (long i = left; i <= right; i++) {
            long r = i / n;
            long c = i % n;

            answer[idx++] = r < c ? (int) c + 1 : (int) r + 1;
        }
        
        return answer;
    }
}