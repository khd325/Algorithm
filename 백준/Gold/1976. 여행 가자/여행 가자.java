import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    static int findParent(int x) {
        if(x == parent[x]) {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }

    static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if(a < b) {
            parent[b] = a;
        }else {
            parent[a] = b;
        }
    }


    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) {
                    unionParent(i, j);
                }
            }
        }

        int[] plans = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            plans[i] = Integer.parseInt(st.nextToken());
        }

        boolean flag = true;
        for (int i = 1; i < m; i++) {
            if (parent[plans[i] - 1] != parent[plans[i -1] - 1]) {
                flag = false;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
