import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[] parent;
    static int findParent(int x){
        if(x == parent[x]) return x;
        else return parent[x] = findParent(parent[x]);
    }

    static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);

        if (a <b) parent[b] = a;
        else parent[a] = b;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n+1];
        for(int i =1; i<= n; i++){
            parent[i] = i;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0){
                unionParent(b,c);
            }else if (a == 1){
                int x = findParent(b);
                int y = findParent(c);

                if(x == y) System.out.println("YES");
                else System.out.println("NO");
            }

        }
        
    }
}

