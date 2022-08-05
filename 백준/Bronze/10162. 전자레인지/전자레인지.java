import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] button = {300, 60, 10};

        for(int i = 0; i < 3; i++){
            int n = T / button[i];
            T %= button[i];
            sb.append(n).append(" ");
        }

        System.out.println(T == 0 ? sb : -1);
    }

}
