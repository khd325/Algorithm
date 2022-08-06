import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int zero = 0;
        int one = 0;

        if(str.charAt(0) - '0' == 0){
            zero+=1;
        }else{
            one+=1;
        }

        for(int i = 0; i< str.length() - 1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                if(str.charAt(i+1) - '0' == 0) zero+=1;
                else if(str.charAt(i+1) - '0' == 1) one+=1;
            }
        }
        System.out.println(Math.min(zero,one));



    }
}

