import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int back = -1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                back = Integer.parseInt(st.nextToken());
                q.offer(back);
            } else if (str.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (str.equals("empty")){
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (str.equals("front")){
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peek()).append("\n");
            } else if (str.equals("back")){
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(back).append("\n");
            }
        }
        System.out.println(sb);
    }
}