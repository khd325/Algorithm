class Solution {
    static boolean isPrime(long n) {
        if(n == 1) {
            return false;
        }else if (n == 2) {
            return true;
        }

        for (long i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }
        String s = sb.reverse().toString();

        String[] split = s.split("0");
        int cnt = 0;
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("")){
                continue;
            }
            if(isPrime(Long.parseLong(split[i]))) {
                cnt++;
            }
        }
        
        return cnt;
    }
}