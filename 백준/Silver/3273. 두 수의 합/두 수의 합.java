import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());

        int x = Integer.parseInt(br.readLine());
        int result = 0;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr.get(start) + arr.get(end);
            if(temp == x){
                result += 1;
            }

            if (temp >= x){
                end--;
            }else {
                start++;
            }
        }

        System.out.println(result);
    }

}
