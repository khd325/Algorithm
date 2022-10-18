import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        System.out.println(prime[0]);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                int j = 2;
                while (i * j <= n) {
                    prime[i * j] = false;
                    j++;
                }
            }
        }

        int[] ints = IntStream.rangeClosed(2, n).filter(i -> n % i == 0 && prime[i]).toArray();
        
        return ints;
    }
}