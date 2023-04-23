import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int recursion(String str, int l, int r, int cnt) {
        if (l >= r) return cnt;

        else if (str.charAt(l) != str.charAt(r)) {
            flag = false;
            return cnt;
        }

        else return recursion(str, l + 1, r - 1, cnt + 1);


    }

    static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1, 1);
    }

    static boolean flag = true;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            flag = true;
            String str = br.readLine();

            int cnt = isPalindrome(str);

            sb.append(flag ? 1 : 0).append(" ").append(cnt).append("\n");

        }
        System.out.println(sb);


    }
}