import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<String, Double> map = new HashMap<>() {{
            put("A+", 4.5);
            put("A0", 4.0);
            put("B+", 3.5);
            put("B0", 3.0);
            put("C+", 2.5);
            put("C0", 2.0);
            put("D+", 1.5);
            put("D0", 1.0);
            put("F", 0.0);
        }};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0d;
        double score = 0d;
        for (int i = 0; i < 20; i++) {
            String[] strs = br.readLine().split(" ");
            if(strs[2].equals("P")) continue;

            sum += Double.parseDouble(strs[1]);
            score += (Double.parseDouble(strs[1]) * map.get(strs[2]));
        }

        System.out.printf("%.6f", score / sum);

    }
}
