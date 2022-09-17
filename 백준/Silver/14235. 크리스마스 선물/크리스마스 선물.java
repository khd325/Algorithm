import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((x1,x2) -> {
            return x2 - x1;
        });

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            if(st.countTokens() == 1){
                st.nextToken();
                if(pq.isEmpty()){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(pq.poll()).append("\n");
                }
            }else {
                int k = Integer.parseInt(st.nextToken());
                for(int j = 0; j < k; j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);

    }
}


