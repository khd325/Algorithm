import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static int n, m;
    static int[][] map;
    static ArrayList<Node> chicken;
    static ArrayList<Node> house;
    static boolean[] visited;
    static int result;

    static void dfs(int index, int cnt) {
        if (cnt == m) {
            int sum = 0;
            for (int i = 0; i < house.size(); i++) {
                int temp = Integer.MAX_VALUE;

                for (int j = 0; j < visited.length; j++) {
                    if (visited[j]) {
                        int dist = Math.abs(chicken.get(j).getX() - house.get(i).getX()) + Math.abs(chicken.get(j).getY() - house.get(i).getY());

                        temp = Math.min(dist, temp);
                    }
                }
                sum += temp;
            }

            result = Math.min(sum, result);
        }

        for (int i = index; i < visited.length; i++) {
            visited[i] = true;
            dfs(i + 1, cnt + 1);
            visited[i] = false;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = Integer.MAX_VALUE;
        map = new int[n][n];
        chicken = new ArrayList<>();
        house = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    house.add(new Node(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Node(i, j));
                }
            }
        }

        visited = new boolean[chicken.size()];

        dfs(0, 0);

        System.out.println(result);

    }
}
