import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static final int R = 31;
    static final int M = 1234567891;
    static final HashMap<Character, Integer> map =  new HashMap<>(){{
        for(int i = 0; i < 26; i++){
            put((char) ('a' + i), i + 1);
        }
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        long sum = 0L;
        int power = 0;

        for(int i = 0; i < str.length(); i++){
            sum += (map.get(str.charAt(i)) * Math.pow(R,power++)) % M;
        }

        System.out.println(sum);

    }
}