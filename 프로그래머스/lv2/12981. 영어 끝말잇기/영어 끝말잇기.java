import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet();
        String prevWord = words[0]; //tank
        set.add(prevWord);

        int turn_count = 1;
        int person = 2;
        for(int i = 1; i < words.length; i++){
            String curWord = words[i];
            if(prevWord.charAt(prevWord.length()-1) != curWord.charAt(0)){
                answer[0] = person;
                answer[1] = turn_count;
                return answer;
            }

            if(prevWord.charAt(prevWord.length()-1) == curWord.charAt(0)){
               if(set.contains(curWord)){
                   answer[0] = person;
                   answer[1] = turn_count;
                   return answer;
               }else {
                   set.add(curWord);
                   prevWord = curWord;
               }
            }

            person++;
            if(person > n){
                person = 1; //1234 1
                turn_count++;
            }
        }
        return new int[]{0,0};
        
    }
}