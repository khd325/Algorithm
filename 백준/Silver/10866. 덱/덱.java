import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static void push(String[] s, Deque<Integer> dq) {
        if (s[0].equals("push_back")) {
            dq.addLast(Integer.parseInt(s[1]));
        } else {
            dq.addFirst(Integer.parseInt(s[1]));
        }
    }

    static void operation(String[] s, Deque<Integer> dq, StringBuilder sb) {
        switch (s[0]) {
            case "front":
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
                break;
            case "back":
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                break;
            case "size":
                sb.append(dq.size()).append("\n");
                break;
            case "empty":
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                break;
            case "pop_front":
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
                break;
            case "pop_back":
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
                break;
        }
    }


    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s.length == 2) {
                push(s, dq);
            } else if (s.length == 1) {
                operation(s, dq, sb);
            }
        }
        System.out.println(sb.toString());
    }
}
