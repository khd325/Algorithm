import java.io.*;
import java.util.*;


public class Main {
    static int[][] map;

    static ArrayList<Integer> list = new ArrayList<>();
    static int m; //가로
    static int n; //세로

    static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >=n || y >= m) return false;

        if(map[x][y] == 1){
            map[x][y] = 0;
            dfs(x+1,y);
            dfs(x-1,y);
            dfs(x,y+1);
            dfs(x,y-1);
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            map = new int[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int b = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(st.nextToken());
                map[a][b] = 1;
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int z = 0; z < m; z++) {
                    if (dfs(j, z)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        
    }
}
