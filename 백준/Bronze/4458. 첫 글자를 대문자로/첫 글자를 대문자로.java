import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }

        for(int i = 0; i < n; i++){
            strs[i] = strs[i].substring(0,1).toUpperCase() + strs[i].substring(1);
        }

        for (String str : strs) {
            System.out.println(str);
        }
    }
}
