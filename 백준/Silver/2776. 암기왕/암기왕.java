import java.io.*;
import java.util.*;

public class Main {

    static int[] noteOne;
    static int[] noteTwo;

    static boolean binarySearch(int num) {
        int start = 0;
        int end = noteOne.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(noteOne[mid] == num){
                return true;
            } else if (noteOne[mid] > num){
                end = mid - 1;
            } else if (noteOne[mid] < num){
                start = mid + 1;
            }
        }

        return false;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            noteOne = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                noteOne[i] = Integer.parseInt(st.nextToken());
            }

            int m = Integer.parseInt(br.readLine());

            noteTwo = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                noteTwo[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(noteOne);

            for (int num : noteTwo) {
                if (binarySearch(num)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}



