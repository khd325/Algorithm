import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        long i = 1;
        long sum = 0;
        int n = 0;
        while (true) {
            sum += i++;
            if(sum > s){
                System.out.println(n);
                break;
            }
            n++;
        }


    }
}

