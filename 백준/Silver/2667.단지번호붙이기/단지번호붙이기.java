import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int[][] map;
    static ArrayList<Integer> list = new ArrayList<>();
    static int idx = -1;
    static boolean dfs(int x,int y){
        if(x <= -1 || y <= -1 || x >= n || y>= n){
            return false;
        }

        if(map[x][y] == 1){
            map[x][y] = idx;
            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x+1,y);
            dfs(x,y+1);

            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1){
                    if(dfs(i,j)){
                        count += 1;
                        idx--;
                    }
                }
            }
        }


        for(int i = -1; i >= -count; i--){
            int check = 0;
            for(int j = 0; j < n ; j++){
                for(int k = 0; k < n; k++){
                    if(map[j][k] == i) check++;
                }
            }
            list.add(check);
        }

        Collections.sort(list);
        System.out.println(count);
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
