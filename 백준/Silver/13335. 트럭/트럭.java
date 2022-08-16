import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int result = 0;

        Queue<Integer> list = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.offer(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < w; i++) {
            q.offer(0);
        }
        int weight = 0;

        while(!q.isEmpty()){
            result++;
            weight -= q.poll();

            if(!list.isEmpty()){
                if(weight + list.peek() <= l){
                    weight += list.peek();
                    q.offer(list.poll());
                } else {
                    q.offer(0);
                }
            }
        }
        System.out.println(result);

    }
}



