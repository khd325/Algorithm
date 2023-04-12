import java.util.*;

class Solution {
    public int solution(int sticker[]) {
        
        if(sticker.length == 1) {
            return sticker[0];
        }
        
        int[] useFirstSticker = new int[sticker.length];
        int[] notUseFirstSticker = new int[sticker.length];

        useFirstSticker[0] = sticker[0];
        useFirstSticker[1] = sticker[0];

        notUseFirstSticker[0] = 0;
        notUseFirstSticker[1] = sticker[1];

        for (int i = 2; i < sticker.length - 1; i++) {
            useFirstSticker[i] = Math.max(useFirstSticker[i-2] + sticker[i], useFirstSticker[i-1]);
        }

        for(int i = 2; i < sticker.length; i++){
            notUseFirstSticker[i] = Math.max(notUseFirstSticker[i-2] + sticker[i], notUseFirstSticker[i-1]);
        }

        int a = Arrays.stream(useFirstSticker).max().getAsInt();
        int b = Arrays.stream(notUseFirstSticker).max().getAsInt();

        return Math.max(a,b);
    }
}