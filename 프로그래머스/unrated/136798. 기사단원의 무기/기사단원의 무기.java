class Solution {
    static int calculate(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(i * i == n){
                cnt++;
            }else if (n % i == 0){
                cnt+=2;
            }
        }
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            int temp = calculate(i);
            if(temp > limit) temp = power;

            result += temp;
        }

        return result;
    }
}