import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int n, m, k, x;
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        dist = new int[n + 1];
        Arrays.fill(dist, -1);
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
        }

        Queue<Integer> q = new LinkedList<>();

        q.offer(x);
        dist[x] = 0;
        while (!q.isEmpty()) {
            int v = q.poll();

            for (int i = 0; i < arr.get(v).size(); i++) {
                int z = arr.get(v).get(i);

                if (dist[z] == -1) {
                    dist[z] = dist[v] + 1;
                    q.offer(z);
                }
            }
        }


        boolean check = false;
        for(int i = 1; i < dist.length; i++){
            if(dist[i] == k){
                System.out.println(i);
                check = true;
            }
        }
        if (!check){
            System.out.println(-1);
        }


    }
}
