import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] cups = {1, 2, 3};

        for (int i = 0; i < n; i++) {
            int aIndex = 0;
            int bIndex = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            for (int j = 0; j < 3; j++) {
                if (cups[j] == a) {
                    aIndex = j;
                } else if (cups[j] == b){
                    bIndex = j;
                }
            }

            cups[aIndex] = b;
            cups[bIndex] = a;
        }

        System.out.println(cups[0]);


    }
}