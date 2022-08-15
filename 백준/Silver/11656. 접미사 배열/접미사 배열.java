import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            String temp = "";
            for(int j = i; j < str.length();j++){
                temp += String.valueOf(str.charAt(j));
            }
            arr.add(temp);
        }

        Collections.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }

    }
}



