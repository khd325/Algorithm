import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(br.readLine());

                arr.sort(String::compareToIgnoreCase);
            }

            System.out.println(arr.get(0));
        }
    }
}
