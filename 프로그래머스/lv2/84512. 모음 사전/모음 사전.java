import java.util.*;

class Solution {
    static char[] cList = {'A', 'E', 'I', 'O', 'U'};
    static List<String> list;
    
    static void dfs(String str, int depth) {
        list.add(str);
        if (depth == cList.length) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            dfs(str + cList[i], depth + 1);
        }
    }
    
    public int solution(String word) {
        list = new ArrayList<>();
        dfs("", 0);
        return list.indexOf(word);
    }
}