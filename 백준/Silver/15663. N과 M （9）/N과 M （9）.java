import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr;
    static int[] temp;
    static boolean[] visited;
    static int n, m;
    static LinkedHashSet<List<Integer>> result;

    static void dfs(int depth) {
        if (depth == m) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < temp.length; i++) {
                list.add(temp[i]);
            }

            result.add(list);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                temp[depth] = arr[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];
        temp = new int[m];
        result = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0);


        StringBuilder sb = new StringBuilder();

        Iterator<List<Integer>> iterator = result.iterator();
        while(iterator.hasNext()) {
            List<Integer> next = iterator.next();
            for (Integer integer : next) {
                sb.append(integer).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
