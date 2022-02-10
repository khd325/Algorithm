import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    static int[] arr;
    static boolean[] visited;
    static int[] sequence;
    static int answer = 0;

    static void dfs(int start,int depth) {
        if (depth == n) {;
            int sum = 0;
            for (int i : arr) {
                sum += i;
//                System.out.print(i + " ");
            }

//            System.out.println("sum = " + sum);
            if (sum == s) answer++;
            return;
        }
        for (int i = start; i < visited.length; i++) {
            if (!visited[i]) {
                arr[depth] = sequence[i];
                visited[i] = true;
                dfs(i+1,depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        sequence = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        while(n > 0){
            arr = new int[n];
            dfs(0,0);
            n--;
        }

        System.out.println(answer);
    }
}
