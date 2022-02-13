import java.io.*;
import java.util.*;

public class Main {

    public static int n, m, result = 0;
    public static int[][] arr = new int[8][8]; // 초기 맵 배열
    public static int[][] temp = new int[8][8]; // 벽을 설치한 뒤의 맵 배열

    // 4가지 이동 방향에 대한 배열
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    // 깊이 우선 탐색(DFS)을 이용해 각 바이러스가 사방으로 퍼지도록 하기
   static void check(int x,int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >=0 && ny <m){
                if(temp[nx][ny] ==0){
                    temp[nx][ny] = 2;
                    check(nx,ny);
                }
            }
        }
   }

    static int getScore(){
       int score =0;
       for(int i = 0; i < n; i++){
           for(int j = 0; j< m;j++){
               if(temp[i][j] ==0){
                   score+=1;
               }
           }
       }

       return score;
    }

    static void dfs(int count){
        if(count == 3){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    temp[i][j] = arr[i][j];
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(temp[i][j] == 2){
                        check(i,j);
                    }
                }
            }
            result = Math.max(result,getScore());
            return;
        }

        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                if(arr[i][j] ==0){
                    arr[i][j] = 1;
                    count++;
                    dfs(count);
                    arr[i][j] = 0;
                    count--;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(result);
    }
}

