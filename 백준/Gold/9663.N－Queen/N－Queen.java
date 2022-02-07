import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int[] row;
    static int result = 0;

    static boolean check(int x) {
        for(int i = 0; i < x; i++){
            if(row[x] == row[i]) return false;
            if(Math.abs(row[x] - row[i]) == x - i) return false;
        }
        return true;
    }

    static void dfs(int x) {
        if(x == n){
            result++;
            return;
        }else{
            for(int i = 0; i < n; i++){
                row[x] = i;
                if(check(x)){
                    dfs(x+1);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        row = new int[n];
        dfs(0);

        System.out.println(result);
    }
}
