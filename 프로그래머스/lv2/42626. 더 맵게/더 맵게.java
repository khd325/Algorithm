import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        int answer = 0;
        boolean flag = true;
        while (pq.peek() < K) {
            if(pq.size() >= 2){
                int a = pq.poll();
                int b = pq.poll();
                int result = a + (b * 2);
                pq.offer(result);
                answer++;
            }else{
                flag = false;
                break;
            }
        }

        return flag ? answer : -1;
    }
}