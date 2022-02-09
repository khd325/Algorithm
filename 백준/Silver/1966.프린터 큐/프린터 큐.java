import java.util.*;
import java.io.*;



class Node {
    private int idx;
    private int value;

    public Node(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }

    public int getIdx() {
        return idx;
    }

    public int getValue() {
        return value;
    }


}


public class Main {
    static int n;
    static int[] arr;
    static int location;
    static StringBuilder sb = new StringBuilder();

    static int solution(){
        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            q.offer(new Node(i,arr[i]));
        }
        int count = 0;
        while(true){
            int max_value = 0;
            int max_idx = 0;
            for (Node node : q) {
                if(node.getValue() > max_value){
                    max_value = node.getValue();
                    max_idx = node.getIdx();
                }
            }
            Node node = q.poll();
            if(node.getValue() == max_value){
                count++;
                if (location == node.getIdx()) {
                    break;
                }
            }else{
                q.offer(new Node(node.getIdx(),node.getValue()));
            }

        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            location = Integer.parseInt(st.nextToken());
            arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(solution()).append("\n");
        }
        System.out.println(sb);
    }
}
