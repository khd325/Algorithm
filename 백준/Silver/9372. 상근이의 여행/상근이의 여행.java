import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            boolean[] visited = new boolean[n + 1];

            for (int i = 0; i < n + 1; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            Queue<Integer> q = new LinkedList<>();

            q.add(1);

            int result = 0;
            visited[1] = true;

            while(!q.isEmpty()){
                int x = q.poll();

                for(int i = 0; i < graph.get(x).size(); i++){
                    if(!visited[graph.get(x).get(i)]){
                        q.add(graph.get(x).get(i));
                        visited[graph.get(x).get(i)] = true;
                        result++;
                    }
                }
            }
            System.out.println(result);


        }
    }
}
