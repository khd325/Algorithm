import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
    private String name;
    private int k;
    private int e;
    private int m;

    public Node(String name, int k, int e, int m) {
        this.name = name;
        this.k = k;
        this.e = e;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Node o) {
        if(this.k == o.k && this.e == o.e && this.m == o.m){
            return this.name.compareTo(o.name);
        }
        if(this.k == o.k && this.e == o.e){
            return o.m - this.m;
        }
        if(this.k == o.k){
            return this.e - o.e;
        }
        return o.k - this.k;
    }
}

public class Main {

    static ArrayList<Node> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr.add(new Node(name,k,e,m));
        }

        Collections.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.println(arr.get(i).getName());
        }
    }
}