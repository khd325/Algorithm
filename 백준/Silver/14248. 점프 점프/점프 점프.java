import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        boolean[] check = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        check[start] = true;

        while (!q.isEmpty()) {

            int x = q.poll();

            int left = x - arr[x];
            int right = x + arr[x];

            if (left >= 1 && left <= n && !check[left]){
                q.offer(left);
                check[left] = true;
            }

            if (right >= 1 && right <= n && !check[right]){
                q.offer(right);
                check[right] = true;
            }
        }

        int result = 0;

        for(int i = 1; i <= n; i++){
            if(check[i]){
                result++;
            }
        }

        System.out.println(result);
    }
}
