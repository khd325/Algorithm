import java.util.*;
import java.io.*;


public class Main {
    static boolean[] visit;
    static int[] arr;
    static void dfs(int n,int m,int depth){
        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        visit = new boolean[n];
        dfs(n,m,0);
    }
}
