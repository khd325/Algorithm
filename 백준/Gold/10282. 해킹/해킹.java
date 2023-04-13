import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Network implements Comparable<Network> {
        int computer;
        int dist;

        public Network(int computer, int distance) {
            this.computer = computer;
            this.dist = distance;
        }

        public int getComputer() {
            return computer;
        }

        public int getDist() {
            return dist;
        }

        @Override
        public int compareTo(Network o) {
            return dist - o.getDist();
        }
    }

    static ArrayList<ArrayList<Network>> networks;
    static int[] distance;

    static void dijkstra(int start) {
        PriorityQueue<Network> pq = new PriorityQueue<>();

        pq.add(new Network(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Network network = pq.poll();
            int dist = network.getDist();
            int now = network.getComputer();

            if (distance[now] < dist) continue;

            for (int i = 0; i < networks.get(now).size(); i++) {
                int nextComputer = networks.get(now).get(i).getComputer();
                int nextDist = networks.get(now).get(i).getDist();

                if (distance[nextComputer] > distance[now] + nextDist) {
                    distance[nextComputer] = distance[now] + nextDist;
                    pq.add(new Network(nextComputer, distance[nextComputer]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            networks = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            distance = new int[n + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);

            for (int i = 0; i <= n; i++) {
                networks.add(new ArrayList<>());
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());

                networks.get(b).add(new Network(a, s));
            }

            dijkstra(c);

            int total = 0;
            int sec = 0;

            for (int i = 1; i <= n; i++) {
                if(distance[i] != Integer.MAX_VALUE) {
                    total++;
                    sec = Math.max(sec, distance[i]);
                }
            }
            sb.append(total).append(" ").append(sec).append("\n");
        }
        System.out.println(sb);

    }
}
