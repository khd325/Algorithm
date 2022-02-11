import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[] parent;
    static int[][] map;

    static int findParent(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = findParent(parent[x]);
    }

    static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) parent[b] = a;
        else parent[a] = b;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine()); //도시의 수
        m = Integer.parseInt(br.readLine()); //여행 계획에 속한 도시의 수


        map = new int[n + 1][n + 1];
        parent = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) unionParent(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[st.countTokens()];
        for(int i = 0; i <arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
       
        for(int i = 0; i < arr.length-1;i++){
            if(parent[arr[i]] != parent[arr[i+1]]){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");


    }
}

