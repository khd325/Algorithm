import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] result = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] arr = photo[i];
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += map.getOrDefault(arr[j], 0);
            }

            result[i] = sum;
        }

        return result;
    }
}