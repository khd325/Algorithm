import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        while(st.hasMoreTokens()){
            set.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> arr = new ArrayList<>(set);

        Collections.sort(arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

    }

}
