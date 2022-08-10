import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0 ; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                Integer y = pq.poll();
                if(y == null){
                    System.out.println(0);
                }else {
                    System.out.println(y);
                }
            } else {
                pq.add(x);
            }
        }
    }
}
