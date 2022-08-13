import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        ArrayList<String> arr = new ArrayList<>();

        String str = br.readLine();

        for(int i = 1; i < str.length()-2; i++){
            for(int j = i+1; j < str.length();j++){
                sb = new StringBuilder();
                String a = str.substring(0,i);
                String b = str.substring(i,j);
                String c = str.substring(j,str.length());

                a = sb.append(a).reverse().toString();
                sb.setLength(0);
                b = sb.append(b).reverse().toString();
                sb.setLength(0);
                c = sb.append(c).reverse().toString();

                arr.add(a+b+c);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
    }
}



