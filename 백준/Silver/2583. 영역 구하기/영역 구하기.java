import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static int n;
    static int m;
    static boolean[][] graph;
    static int cnt;
    static ArrayList<Integer> arr = new ArrayList<>();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void dfs(int x, int y) {
        if (graph[x][y]){
            return;
        }

        if(!graph[x][y]){
            graph[x][y] = true;
            cnt += 1;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < m){
                    dfs(nx,ny);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());
        graph = new boolean[n][m];


        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());


            for (int u = x1; u < x2; u++) {
                for (int v = y1; v < y2; v++) {
                    graph[u][v] = true;
                }
            }
        }
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!graph[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    result += 1;
                    arr.add(cnt);
                }
            }

        }

        Collections.sort(arr);

        System.out.println(result);

        for(int i = 0; i < arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
