import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "A");
            babbling[i] = babbling[i].replaceAll("ye", "B");
            babbling[i] = babbling[i].replaceAll("woo", "C");
            babbling[i] = babbling[i].replaceAll("ma", "D");
        }

        for (int i = 0; i < babbling.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < babbling[i].length() - 1; j++) {
                if(babbling[i].charAt(j) == babbling[i].charAt(j+1)){
                    isDuplicate = true;
                }
            }
            if(isDuplicate) continue;
            
            
            boolean isUpper = true;
            for (int j = 0; j < babbling[i].length(); j++) {
                if (!Character.isUpperCase(babbling[i].charAt(j))) {
                    isUpper = false;
                    break;
                }
            }
            if (isUpper) {
                arr.add(babbling[i]);
            }
        }

        return arr.size();
    }
}