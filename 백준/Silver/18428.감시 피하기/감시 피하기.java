import java.util.*;
import java.io.*;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Node{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Combination{
    private int n;
    private int r;
    private int[] now;
    private ArrayList<ArrayList<Node>> result;

    public Combination(int n, int r){
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<ArrayList<Node>>();
    }

    public ArrayList<ArrayList<Node>> getResult() {
        return result;
    }

    public void combination(ArrayList<Node> arr, int depth, int index,int target){
        if(depth == r){
            ArrayList<Node> temp = new ArrayList<>();
            for(int i = 0; i < now.length;i++){
                temp.add(arr.get(now[i]));
            }
            result.add(temp);
            return;
        }

        if(target == n){
            return;
        }

        now[index] = target;
        combination(arr,depth+1,index+1,target+1);
        combination(arr,depth,index,target+1);
    }
}

public class Main {
    static int n;
    static char[][] map;
    static ArrayList<Node> teachers = new ArrayList<Node>();
    static ArrayList<Node> spaces = new ArrayList<Node>();

    static boolean process(){
        for(int i = 0; i < teachers.size();i++){
            int x = teachers.get(i).getX();
            int y = teachers.get(i).getY();
            for(int j = 0; j < 4; j++){
                if(watch(x,y,j)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean watch(int x,int y, int direction){
        if(direction ==0){
            while(y >= 0){
                if(map[x][y] == 'S'){
                    return true;
                }
                if(map[x][y] == 'O'){
                    return false;
                }
                y -=1;
            }
        }

        if(direction==1){
            while(y <n){
                if(map[x][y] == 'S'){
                    return true;
                }
                if(map[x][y] == 'O'){
                    return false;
                }
                y +=1;
            }
        }

        if(direction==2){
            while(x >= 0){
                if(map[x][y] == 'S'){
                    return true;
                }
                if(map[x][y] == 'O'){
                    return false;
                }
                x -= 1;
            }
        }

        if(direction==3){
            while(x < n){
                if(map[x][y] == 'S'){
                    return true;
                }
                if(map[x][y] == 'O'){
                    return false;
                }
                x+=1;
            }
        }
        return false;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = st.nextToken().charAt(0);

                if (map[i][j] == 'T') {
                    teachers.add(new Node(i, j));
                } else if (map[i][j] == 'X') {
                    spaces.add(new Node(i, j));
                }
            }
        }
        Combination comb = new Combination(spaces.size(),3);
        comb.combination(spaces,0,0,0);
        ArrayList<ArrayList<Node>> spaceList = comb.getResult();


        boolean found = false;
        for(int i = 0; i <spaceList.size();i++){
            for(int j = 0; j < spaceList.get(i).size();j++){
                int x = spaceList.get(i).get(j).getX();
                int y = spaceList.get(i).get(j).getY();
                map[x][y] = 'O';
            }
            if(!process()){
                found = true;
                break;
            }

            for(int j = 0; j < spaceList.get(i).size();j++){
                int x = spaceList.get(i).get(j).getX();
                int y = spaceList.get(i).get(j).getY();

                map[x][y] = 'X';
            }
        }

        if(found) System.out.println("YES");
        else System.out.println("NO");
    }
}