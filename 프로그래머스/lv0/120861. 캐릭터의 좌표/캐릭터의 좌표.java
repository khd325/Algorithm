import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        HashMap<String, Integer[]> map = new HashMap<>() {{
            put("left", new Integer[]{-1, 0});
            put("right", new Integer[]{1, 0});
            put("up", new Integer[]{0, 1});
            put("down", new Integer[]{0, -1});
        }};
        
        int x = 0;
        int y = 0;
        
        int n = board[0] / 2;
        int m = board[1] / 2;
        
        for(String c : keyinput) {
            Integer[] direction = map.get(c);
            int nx = x + direction[0];
            int ny = y + direction[1];
            
            if(nx < -n || nx > n || ny < -m || ny > m){
                continue;
            }
            
            x = nx;
            y = ny;
        }
        
        return new int[]{x,y};
        
    }
}