import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> userMap = new HashMap<>();

        List<String> result = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] split = record[i].split(" ");
            if(split[0].equals("Enter") || split[0].equals("Change")) {
                String userId = split[1];
                String name = split[2];

                userMap.put(userId, name);
            }
        }

        for(int i = 0; i < record.length; i++){

            String[] split = record[i].split(" ");
            if(split[0].equals("Enter")) {
                result.add(userMap.get(split[1]) + "님이 들어왔습니다.");
            }else if (split[0].equals("Leave")) {
                result.add(userMap.get(split[1]) + "님이 나갔습니다.");
            }
        }


        return result.toArray(new String[0]);
    }
}