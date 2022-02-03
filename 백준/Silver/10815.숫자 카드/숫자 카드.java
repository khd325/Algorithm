import java.util.*;
import java.io.*;

public class Main {
    static int[] a;
    static int[] b;

    static boolean BinarySearch(int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] > target) {
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        b = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.length;i++){
            if(BinarySearch(b[i])){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}