import java.util.*;

class Solution {
    public long solution(String numbers) {
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("zero", "0");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            if(numbers.contains(string)){
                numbers = numbers.replaceAll(string,map.get(string));
            }
        }
        
        return Long.parseLong(numbers);
    }
}