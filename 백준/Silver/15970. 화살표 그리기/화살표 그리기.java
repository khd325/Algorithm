import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.get(y).add(x);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(arr.get(i));
        }

        int result = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (j == 0) {
                    result += arr.get(i).get(j + 1) - arr.get(i).get(j);
                } else if (j == arr.get(i).size() - 1) {
                    result += arr.get(i).get(j) - arr.get(i).get(j-1);
                } else {
                    result += Math.min(arr.get(i).get(j) - arr.get(i).get(j-1), arr.get(i).get(j+1) -arr.get(i).get(j));
                }
            }
        }
        System.out.println(result);
    }
}


