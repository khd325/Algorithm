class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            String str = babbling[i];
            for (int j = 0; j < possible.length; j++) {
                str = str.replaceFirst(possible[j],".");
            }

            String replace = str.replace(".", "");
            if(replace.length() ==0){
                answer++;
            }
        }

        return answer;
    }
}