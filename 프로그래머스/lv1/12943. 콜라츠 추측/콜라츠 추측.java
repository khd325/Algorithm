class Solution {
    public int solution(long num) {
        
        if(num == 1L){
            return 0;
        }

        int count = 0;
        
        for(int i = 0; i < 500; i++){
            if(num == 1){
                break;
            }
            if(num % 2 == 0){
                num /= 2;
            }else {
                num = num * 3 + 1;
            }
            count++;
        }
        return count == 500 ? -1 : count;
        
    }
}