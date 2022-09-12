import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Node {
    int s;
    int t;
    int cnt;

    public Node(int s, int t, int cnt) {
        this.s = s;
        this.t = t;
        this.cnt = cnt;
    }

    public int getS() {
        return s;
    }

    public int getT() {
        return t;
    }

    public int getCnt() {
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = bfs(a, b, 0);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }


    static int bfs(int s, int t, int cnt) {
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(s, t, cnt));
        int result = 0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            int a = node.getS();
            int b = node.getT();
            int c = node.getCnt();

            if(a==b){
                result = c;
                break;
            }

            if (a * 2 <= b + 3) {
                q.add(new Node(a * 2, b + 3, c + 1));
            }
            q.add(new Node(a+1,b,c+1));
        }

        return result;
    }
}

