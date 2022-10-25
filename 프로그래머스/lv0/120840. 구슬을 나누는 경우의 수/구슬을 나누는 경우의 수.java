import java.math.BigDecimal;

class Solution {
    static BigDecimal factorial(int n) {
        if (n <= 1) {
            return new BigDecimal(1);
        }

        return new BigDecimal(n).multiply(factorial(n - 1));
    }
    
    public BigDecimal solution(int balls, int share) {
        BigDecimal a = factorial(balls);
        BigDecimal b = factorial(balls - share);
        BigDecimal c = factorial(share);

        return a.divide(b.multiply(c));
    }
    
}