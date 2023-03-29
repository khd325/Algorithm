import java.util.*;

class Solution {
    static final HashMap<String, Integer> map = new HashMap<>() {
        {
            put("N", 0);
            put("S", 1);
            put("W", 2);
            put("E", 3);
        }
    };
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    static boolean check(String[] park, int x, int y, String dir, int dis) {
        for (int i = 0; i < dis; i++) {
            x += dx[map.get(dir)];
            y += dy[map.get(dir)];

            if (x >= park.length || x < 0 || y >= park[i].length() || y < 0) {
                return false;
            }

            if (park[x].charAt(y) == 'X') {
                return false;
            }
        }

        return true;
    }
    
    
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;

        loop:
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break loop;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String route = routes[i];
            String dir = route.split(" ")[0];
            int dis = Integer.parseInt(route.split(" ")[1]);

            if (check(park, x, y, dir, dis)) {
                x += dis * dx[map.get(dir)];
                y += dis * dy[map.get(dir)];
            }
        }

        return new int[]{x, y};
    }
}