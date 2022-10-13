import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i+=n){
            if(i + n > my_str.length()){
                list.add(my_str.substring(i));
            }else {
                list.add(my_str.substring(i,i+n));
            }
        }
        
        return list.toArray(String[]::new);
        
    }
}