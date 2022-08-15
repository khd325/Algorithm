import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] board = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            Arrays.fill(board[i],Character.MIN_VALUE);
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0 ; j < 5; j++){
                if(board[j][i] != Character.MIN_VALUE){
                    sb.append(board[j][i]);
                }
            }
        }
        System.out.println(sb);

    }
}



