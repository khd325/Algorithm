import java.io.*;

public class Main {
    static char[][] arr;
    static int n;
    static int max = 0;

    static void check(){
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = 0; j < n-1;j++){
                if(arr[i][j] == arr[i][j+1]) count++;
                else count = 1;
                max = Math.max(max,count);
            }
        }


        for(int i = 0; i < n;i++){
            int count = 1;
            for(int j = 0; j < n-1; j++){
                if(arr[j][i] == arr[j+1][i])
                    count++;
                else count = 1;
                max = Math.max(count,max);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        //가로 교환
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1;j++){
                char temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;

                check();

                temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
            }
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n; j++){
                char temp = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = temp;

                check();

                temp = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = temp;
            }
        }
        System.out.println(max);
    }
}


