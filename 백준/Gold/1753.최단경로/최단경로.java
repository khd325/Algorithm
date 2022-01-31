import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex(){
        return this.index;
    }

    public int getDistance(){
        return this.distance;
    }

    @Override
    public int compareTo(Node o) {
       return this.distance - o.distance;
    }
}

public class Main {
    static int INF = (int)1e9;
    static int v,e,start;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    static int[] d;

    static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();

            if(d[now] < dist) continue;
            for(int i = 0; i < graph.get(now).size();i++){
                int cost = d[now] + graph.get(now).get(i).getDistance();

                if(cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(),cost));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        for(int i = 0; i <= v; i++){
            graph.add(new ArrayList<Node>());
        }
        for(int i = 0; i < e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b,c));
        }

        d = new int[v+1];
        Arrays.fill(d,INF);
        d[start] = 0;
        dijkstra(start);

        for(int i = 1; i<=v;i++){
            if(d[i] == INF) sb.append("INF\n");
            else sb.append(d[i]).append("\n");
        }

        System.out.println(sb);
    }
}
