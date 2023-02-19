import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {

    static int order;
    static int[] arr;
    static ArrayList<ArrayList<Integer>> list;

    static void dfs(int start) {
        if (arr[start] == 0) {
            arr[start] = order++;
        }

        for (int i = 0; i < list.get(start).size(); i++) {
            Integer node = list.get(start).get(i);
            if (arr[node] == 0) {
                dfs(node);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        order = 1;
        arr = new int[N + 1];

        list = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i < list.size(); i++) {
            list.get(i).sort(Comparator.reverseOrder());
        }

        dfs(R);

        for(int i = 1; i <= N; i++){
            System.out.println(arr[i]);
        }
    }
}