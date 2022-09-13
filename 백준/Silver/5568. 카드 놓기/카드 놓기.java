import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    static void dfs(int depth) {
        if (depth == k) {
            String temp = "";
            for (String s : arr) {
                temp += s;
            }
            if (!set.contains(temp)) {
                set.add(temp);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                arr[depth] = strs[i];
                dfs(depth+1);
                check[i] = false;
            }
        }
    }

    static String[] strs;
    static boolean[] check;
    static int n, k;
    static HashSet<String> set = new HashSet<>();
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        strs = new String[n];
        arr = new String[k];
        check = new boolean[n];

        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }
        dfs(0);
        System.out.println(set.size());

    }
}


