import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static boolean[] visit;
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visit[start] = true;
        q.offer(start);
        int count = 0;

        while(!q.isEmpty()){
            int x = q.poll();

            for(int i = 0; i<list.get(x).size();i++){
                int y = list.get(x).get(i);
                if(!visit[y]){
                    visit[y] = true;
                    q.offer(y);
                    count++;
                }
            }
        }
        System.out.println(count);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n+1; i++){
            list.add(new ArrayList<Integer>());
        }

        int k = Integer.parseInt(br.readLine());
        for(int i =0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i = 1; i <= n;i++){
            Collections.sort(list.get(i));
        }
        visit = new boolean[n+1];
        bfs(1);
    }
}
