import java.util.*;
import java.io.*;


public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static int[] temp;
    static int result = 0;
    static void dfs(int depth){
        if(depth == n){
            int sum = 0;
            for(int i = 0; i < n-1; i++){
                sum += Math.abs(temp[i] - temp[i+1]);
            }

            result = Math.max(sum,result);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        temp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(result);

    }

}