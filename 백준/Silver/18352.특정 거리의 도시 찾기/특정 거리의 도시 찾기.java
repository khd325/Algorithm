import java.io.*;
import java.util.*;


public class Main {
    static int n,m,k,x;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        d = new int[n+1];

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }
        for(int i = 1; i <=n; i++){
            Collections.sort(graph.get(i));
        }

        Arrays.fill(d,-1);
        Queue<Integer> q = new LinkedList<>();
        d[x] = 0;
        q.offer(x);

        while(!q.isEmpty()){
            int v = q.poll();

            for(int i = 0; i < graph.get(v).size(); i++) {
                int y = graph.get(v).get(i);
                if (d[y] == -1) {
                    d[y] = d[v] + 1;
                    q.offer(y);

                }
            }
        }

        int cnt = 0;
        for(int i = 1; i < d.length;i++){
            if(d[i] == k){
                System.out.println(i);
                cnt++;
            }
        }

        if(cnt == 0) System.out.println(-1);
    }
}

