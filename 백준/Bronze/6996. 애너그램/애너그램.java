import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final String ANAGRAMS = " are anagrams.\n";
        final String NOT_ANAGRAMS = " are NOT anagrams.\n";
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            String[] strA = a.split("");
            String[] strB = b.split("");

            Arrays.sort(strA);
            Arrays.sort(strB);

            if (Arrays.equals(strA, strB)) {
                sb.append(a).append(" & ").append(b).append(ANAGRAMS);
            }else {
                sb.append(a).append(" & ").append(b).append(NOT_ANAGRAMS);
            }
        }

        System.out.println(sb.toString());
    }
}
