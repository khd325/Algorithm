import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cur = Integer.parseInt(br.readLine());
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        if(n >= 2) {
            Collections.sort(arr, Collections.reverseOrder());

            while (cur <= arr.get(0)) {
                cur++;
                cnt++;
                int x = arr.get(0);
                arr.remove(0);
                arr.add(x - 1);
                Collections.sort(arr, Collections.reverseOrder());
            }
        }
        System.out.println(cnt);
    }
}



