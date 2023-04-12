import java.util.*;

class Solution {
    
    static class Town {
        int town;
        int distance;

        public Town(int town, int distance) {
            this.town = town;
            this.distance = distance;
        }

        public int getTown() {
            return town;
        }

        public int getDistance() {
            return distance;
        }
    }
    
    
    static ArrayList<ArrayList<Town>> graph = new ArrayList<>();
    static int[] dist;
    static boolean[] visited;
    
    static void dijkstra(int start) {
        PriorityQueue<Town> pq = new PriorityQueue<>((t1, t2) -> t1.getDistance() - t2.getDistance());

        pq.add(new Town(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Town currentTown = pq.poll();

            int now = currentTown.getTown();
            visited[currentTown.getTown()] = true;

            for (int i = 0; i < graph.get(currentTown.getTown()).size(); i++) {
                if (!visited[graph.get(now).get(i).getTown()]) {
                    int nextTown = graph.get(now).get(i).getTown();
                    int nextDist = graph.get(now).get(i).getDistance();

                    if (dist[nextTown] > dist[now] + nextDist) {
                        dist[nextTown] = dist[now] + nextDist;
                        pq.add(new Town(nextTown, dist[nextTown]));
                    }
                }
            }
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        dist = new int[N + 1];
        visited = new boolean[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < road.length; i++) {
            int u = road[i][0];
            int v = road[i][1];
            int w = road[i][2];

            graph.get(u).add(new Town(v, w));
            graph.get(v).add(new Town(u, w));
        }

        dijkstra(1);
        int result = 0;
    
        System.out.println(Arrays.toString(dist));
        for(int i = 1; i <= N; i++) {
            if(dist[i] <= K) {
                result++;
            }
        }
        
        return result;
    }
}