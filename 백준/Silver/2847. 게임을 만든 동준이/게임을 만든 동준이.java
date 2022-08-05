import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] level = new int[n];
        for (int i = 0; i < n; i++){
            level[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;


        for(int i = n-2; i >=0 ; i--){
            if (level[i] >= level[i+1]){
                result += (level[i] - level[i+1] + 1);
                level[i] = level[i+1] - 1;
            }
        }

        System.out.println(result);
    }

}
