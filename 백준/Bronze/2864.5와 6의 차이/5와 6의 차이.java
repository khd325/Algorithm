import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String a = st.nextToken();
        String b = st.nextToken();

        String replaceA = a.replace("5", "6");
        String replaceB = b.replace("5", "6");

        max = Math.max(Integer.parseInt(replaceA) + Integer.parseInt(replaceB),max);
        min = Math.min(Integer.parseInt(replaceA) + Integer.parseInt(replaceB),min);

        replaceA = a.replace("6","5");
        replaceB = b.replace("6","5");

        max = Math.max(Integer.parseInt(replaceA) + Integer.parseInt(replaceB),max);
        min = Math.min(Integer.parseInt(replaceA) + Integer.parseInt(replaceB),min);

        System.out.println(min + " " + max);
    }
}
