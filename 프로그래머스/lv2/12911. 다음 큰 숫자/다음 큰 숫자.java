class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount = 0;
        String s = Integer.toBinaryString(n);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - '0' == 1){
                oneCount++;
            } 
        }
        
        while (true) {
            n++;
            String temp = Integer.toBinaryString(n);
            int cnt = 0;
            for(int i = 0; i < temp.length(); i++){
                if(temp.charAt(i) - '0' == 1){
                    cnt++;
                } 
            }
        
            if(cnt == oneCount) {
                answer = n;
                break;
            }
        }
        return answer;   
    }
}