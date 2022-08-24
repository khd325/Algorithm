import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> in = new HashMap<>();
        for (int i = 0; i < n; i++) {
            in.put(br.readLine(), i);
        }

        ArrayList<String> out = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            out.add(br.readLine());
        }

        int result = 0;

        for (int i = 0; i < out.size() - 1; i++) {
            for (int j = i + 1; j < out.size(); j++) {
                if(in.get(out.get(i)) > in.get(out.get(j))){
                    result++;
                    break;
                }
            }
        }

        System.out.println(result);

    }

}
