import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        
        if(Arrays.stream(works).sum() <= n) {
            return 0;
        }
        
        long result = 0L;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }

        while (n > 0) {
            pq.add(pq.poll() - 1);
            n--;
        }

        while (!pq.isEmpty()) {
            result += Math.pow(pq.poll(), 2);
        }

        return result;
    }
}