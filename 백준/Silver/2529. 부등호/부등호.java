import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static char[] op;
    static int[] arr;
    static int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static boolean[] visited = new boolean[10];
    static String min = "9999999999";
    static String max = "0";

    static void dfs(int depth) {
        if(depth > arr.length){
            return;
        }
        if (depth == arr.length) {
            for (int i = 0; i < op.length; i++) {
                if (op[i] == '>'){
                    if (arr[i] <= arr[i+1]){
                        return;
                    }
                }else if (op[i] == '<'){
                    if (arr[i] >= arr[i+1]){
                        return;
                    }
                }
            }

            String temp = "";
            for (int i : arr) {
                temp += i;
            }

            if (Long.parseLong(temp) < Long.parseLong(min)){
                min = temp;
            }

            if(Long.parseLong(temp) > Long.parseLong(max)){
                max = temp;
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = numbers[i];
                dfs(depth + 1);
                visited[i] = false;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        op = new char[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            op[i] = st.nextToken().charAt(0);
        }
        arr = new int[n + 1];
        dfs(0);

        System.out.println(max);
        System.out.println(min);
    }
}
