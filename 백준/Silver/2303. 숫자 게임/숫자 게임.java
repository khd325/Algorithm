import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());


        int[][] arr = new int[n + 1][5];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int person = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int x = 0; x < 3; x++) {
                for (int y = x + 1; y < 4; y++) {
                    for (int z = y + 1; z < 5; z++) {
                        int temp = (arr[i][x] + arr[i][y] + arr[i][z]) % 10;

                        if(temp >= sum){
                            sum = temp;
                            person = i;
                        }
                    }
                }

            }
        }

        System.out.println(person);
    }

}
