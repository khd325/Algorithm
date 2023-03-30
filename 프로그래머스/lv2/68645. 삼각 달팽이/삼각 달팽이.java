import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
        }


        int x = -1;
        int y = 0;
        int num = 1;
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        int dir = 0;
        while (n >= 0) {
            for (int i = 0; i < n; i++) {
                x += dx[dir];
                y += dy[dir];
                arr[x][y] = num++;
            }
            dir = (dir + 1) % 3;
            n--;
        }

        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }
}