import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String p = "";
        for (int i = 0; i < n * 2 + 1; i++) {
            if (i % 2 == 0) p += "I";
            else p += "O";
        }
        
        int cnt = 0;
        int left = 0;

        while (true) {
            while(s.charAt(left) != 'I') {
                left++;
            }
            if(left > s.length() - (n * 2 + 1)) {
                break;
            }

            if(s.substring(left, left + (n*2+1)).equals(p)) {
                cnt++;
            }
            left++;

        }

        System.out.println(cnt);
        
    }
}

