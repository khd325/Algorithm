import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int n;
    static int m;
    static boolean[] visited;
    static int result;

    static void dfs(ArrayList<ArrayList<Integer>> list, int now) {
        if (list.get(now).size() == 0) {
            return;
        }

        for (int i = 0; i < list.get(now).size(); i++) {
            if(!visited[list.get(now).get(i)]) {
                visited[list.get(now).get(i)] = true;
                result++;
                dfs(list,list.get(now).get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(b).add(a);
        }

        int node = Integer.parseInt(br.readLine());

        dfs(list,node);

        System.out.println(result);

    }
}
