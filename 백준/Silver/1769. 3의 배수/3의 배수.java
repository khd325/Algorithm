import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 0;
        while (str.length() != 1) {
            int temp = 0;

            for (int i = 0; i < str.length(); i++) {
                temp += str.charAt(i) - '0';
            }

            str = String.valueOf(temp);
            cnt++;
        }

        if (str.charAt(0) == '3' || str.charAt(0) == '6' || str.charAt(0) == '9'){
            System.out.println(cnt);
            System.out.println("YES");
        }else {
            System.out.println(cnt);
            System.out.println("NO");
        }


    }
}
