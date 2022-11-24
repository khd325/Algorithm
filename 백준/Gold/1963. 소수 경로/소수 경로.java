import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] isPrime = new boolean[10000];

    static void setPrime() {
        Arrays.fill(isPrime, true);

        for (int i = 2; i < Math.sqrt(10000) + 1; i++) {
            if (isPrime[i]) {
                int j = 2;
                while (i * j < 10000) {
                    isPrime[i * j] = false;
                    j++;
                }
            }
        }
    }
    static int change(int i, int j, int num) {
        String[] arr = String.valueOf(num).split("");
        arr[i] = String.valueOf(j);
        String result = String.join("", arr);
        return Integer.parseInt(result);
    }

    public static void main(String[] args) throws IOException {
        setPrime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());



            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            int[] count = new int[10000];

            q.add(a);
            visited[a] = true;

            while (!q.isEmpty()) {
                int num = q.poll();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (i == 0 && j == 0) continue;

                        int k = change(i, j, num);

                        if (isPrime[k] && !visited[k]) {
                            q.add(k);
                            visited[k] = true;
                            count[k] = count[num] + 1;
                        }
                    }
                }
            }
            System.out.println(count[b]);
        }
    }
}
