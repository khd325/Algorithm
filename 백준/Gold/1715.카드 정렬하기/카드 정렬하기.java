import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        while(pq.size() != 1){
            int one = pq.poll();
            int two = pq.poll();

            int summary = one + two;
            result += summary;
            pq.offer(summary);
        }
        System.out.println(result);

    }
}