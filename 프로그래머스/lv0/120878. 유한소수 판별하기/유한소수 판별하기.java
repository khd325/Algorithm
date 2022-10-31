class Solution {
    static int GCD(int a, int b){
        if (b == 0){
            return a;
        }
        
        return GCD(b, a % b);
    }
    public int solution(int a, int b) {
        int gcd = GCD(a,b);
        b /= gcd;
        
        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0){
            b /= 5;
        }
        
        return b == 1 ? 1 : 2;
    }
}