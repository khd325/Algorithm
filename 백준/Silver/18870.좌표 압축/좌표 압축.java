import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        int[] copy = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = copy[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(copy);

        int cnt = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(copy[0],0);
        for (int i = 1; i < n; i++) {
            if (copy[i] != copy[i - 1]) {
                map.put(copy[i], cnt++);
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(input[i]) + " ");
        }
        System.out.println(sb);
    }
}