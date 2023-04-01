import java.util.*;

class Solution {
    public int solution(String dirs) {
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('U', 0);
            put('D', 1);
            put('L', 2);
            put('R', 3);
        }};

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        //[방향][좌표+5][좌표+5]
        boolean[][][] visited = new boolean[4][11][11];

        int x = 5;
        int y = 5;

        int result = 0;

        for (int i = 0; i < dirs.length(); i++) {
            int dir = map.get(dirs.charAt(i));

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= 11 || ny >= 11) {
                continue;
            }

            if (!visited[dir][nx][ny]) {
                visited[dir][nx][ny] = true;
                dir = (dir % 2 == 0) ? dir + 1 : dir -1;
                visited[dir][x][y] = true;
                result++;
            }

            x = nx;
            y = ny;

        }

        return result;
    }
}