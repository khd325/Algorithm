class Solution {
    
    static boolean[] visited;
    static double[] inclination;
    static boolean flag;
    
    static void dfs(int depth, int idx, int[][] dots) {
        if (flag) return;

        if (depth == 2) {

            int[] visitedCoordinates = new int[2];
            int[] notVisited = new int[2];

            int cnt = 0;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    visitedCoordinates[cnt++] = i;
                }
            }

            cnt = 0;

            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]) {
                    notVisited[cnt++] = i;
                }
            }

            int dx = Math.abs(dots[visitedCoordinates[0]][0] - dots[visitedCoordinates[1]][0]);
            int dy = Math.abs(dots[visitedCoordinates[0]][1] - dots[visitedCoordinates[1]][1]);

            inclination[0] = (double) dy / dx;

            dx = Math.abs(dots[notVisited[0]][0] - dots[notVisited[1]][0]);
            dy = Math.abs(dots[notVisited[0]][1] - dots[notVisited[1]][1]);

            inclination[1] = (double) dy / dx;

            if(inclination[0] == inclination[1]) flag = true;

            return;
        }

        for (int i = idx; i < 4; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, i + 1, dots);
                visited[i] = false;
            }
        }
    }
    public int solution(int[][] dots) {
        visited = new boolean[dots.length];
        flag = false;
        inclination = new double[2];
        dfs(0, 0, dots);


        return flag ? 1 : 0;
    }
}