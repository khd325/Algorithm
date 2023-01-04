import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int result = 0;
        
        
         Queue<String> q = new LinkedList<>();

        if (cacheSize == 0) {
            result = cities.length * 5;
        } else {
            for (int i = 0; i < cities.length; i++) {
                if (q.contains(cities[i].toLowerCase())) {
                    result += 1;
                    q.remove(cities[i].toLowerCase());
                }else {
                    result += 5;
                    if(q.size() == cacheSize) {
                        q.poll();
                    }
                }
                q.offer(cities[i].toLowerCase());
            }
        }
        
        return result;
    }
}