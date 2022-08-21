import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Country implements Comparable<Country> {
    private int num;
    private int g;
    private int s;
    private int b;
    private int rank = 0;

    Country(int num, int g, int s, int b) {
        this.num = num;
        this.g = g;
        this.s = s;
        this.b = b;
    }

    public int getNum() {
        return num;
    }

    public int getG() {
        return g;
    }

    public int getS() {
        return s;
    }

    public int getB() {
        return b;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Country o) {
        if (this.g == o.getG() && this.s == o.getS()) {
            return o.getB() - this.b;
        } else if (this.g == o.getG()) {
            return o.getS() - this.s;
        } else {
            return o.getG() - this.g;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Country> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.add(new Country(num, g, s, b));
        }

        Collections.sort(arr);

        arr.get(0).setRank(1);
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            Country cur = arr.get(i);
            Country pre = arr.get(i - 1);

            if(pre.getG() == cur.getG() && pre.getS() == cur.getS() && pre.getB() == cur.getB()) {
                cur.setRank(pre.getRank());
                cnt++;
            } else {
                cur.setRank(++cnt);
            }
        }

        for (Country country : arr) {
            if(country.getNum() == k){
                System.out.println(country.getRank());
                break;
            }
        }

    }
}