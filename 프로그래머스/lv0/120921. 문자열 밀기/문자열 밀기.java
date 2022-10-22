import java.util.*;

class Solution {
    public int solution(String A, String B) {
        
        String[] str = A.split("");
        String[] b = B.split("");
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        for(int i = 0; i < list.size(); i++){
            if(list.toString().equals(Arrays.toString(b))){
                return i;
            }
            
            String s = list.get(list.size() - 1);
            list.remove(list.size() -1);
            list.add(0,s);
        }
        
        return -1;
    }
}