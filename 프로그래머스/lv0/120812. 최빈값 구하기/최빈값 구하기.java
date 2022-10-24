class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        int maxCnt = 0;

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
            if(maxCnt < count[array[i]]){
                maxCnt = count[array[i]];
            }
        }

        int cnt = 0;
        for(int i = 0; i < count.length; i++){
            if(maxCnt == count[i]){
                cnt++;
            }
        }

        if(cnt > 1){
            return -1;
        }else {
            for(int i = 0; i < count.length; i++){
                if(maxCnt == count[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}