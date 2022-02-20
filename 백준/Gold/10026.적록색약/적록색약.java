import java.util.*;
import java.io.*;

public class Main {
    static char[][] map;
    static int n;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean dfs(int x, int y, char c) {
        if(x < 0 || y < 0 || x >=n || y>=n) return false;
        if(visited[x][y]) return false;

        if(map[x][y] == c && !visited[x][y]){
            visited[x][y] = true;
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                dfs(nx,ny,map[x][y]);
            }
            return true;
        }

        return false;
    }

    static boolean dfs2(int x, int y, char c){
        if(x < 0 || y < 0 || x >= n || y >= n) return false;
        if(visited[x][y]) return false;

        if(c == 'R' || c == 'G'){
            if(map[x][y] == 'B') return false;
            else{
                if(!visited[x][y]){
                    visited[x][y] = true;
                    for(int i = 0; i < 4; i++){
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        dfs2(nx,ny,map[x][y]);
                    }
                    return true;
                }
            }
        }else{
            if(map[x][y] == c && !visited[x][y]){
                visited[x][y] = true;
                for(int i = 0; i < 4; i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    dfs2(nx,ny,map[x][y]);
                }
                return true;
            }
        }



        return false;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        map = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i,j,map[i][j])) cnt++;
            }
        }

        sb.append(cnt).append(" ");
        visited = new boolean[n][n];
        cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dfs2(i,j,map[i][j])) cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);

    }
}