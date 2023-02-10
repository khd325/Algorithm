import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1,i2) -> i2 - i1);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
            }else {
                pq.add(num);
            }
        }

        System.out.println(sb);
    }
}