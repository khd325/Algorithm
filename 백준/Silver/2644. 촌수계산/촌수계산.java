import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            arr.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.get(x).add(y);
            arr.get(y).add(x);
        }

        int[] d = new int[n + 1];

        Arrays.fill(d,-1);

        Queue<Integer> q = new LinkedList<>();

        q.offer(a);
        d[a] = 0;
        while(!q.isEmpty()){

            int k = q.poll();

            for(int i = 0; i < arr.get(k).size(); i++){
                int v = arr.get(k).get(i);
                if (d[v] == -1){
                    d[v] = d[k] + 1;
                    q.offer(v);
                }
            }
        }
        System.out.println(d[b]);

    }
}



