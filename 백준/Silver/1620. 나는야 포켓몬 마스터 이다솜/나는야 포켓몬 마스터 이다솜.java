import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] strs = new String[n + 1];


        for (int i = 1; i <= n; i++) {
            String key = br.readLine();
            map.put(key, i);
            strs[i] = key;
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            try {
                int num = Integer.parseInt(s);
                sb.append(strs[num]);
            } catch (Exception e) {
                sb.append(map.get(s));
            } finally {
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
}