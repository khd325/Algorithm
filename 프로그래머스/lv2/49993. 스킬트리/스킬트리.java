import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int result = 0;

        List<String> skills = Arrays.stream(skill.split("")).collect(Collectors.toList());

        for(int i = 0; i < skill_trees.length; i++){
            String tree = skill_trees[i];

            List<Integer> collect = Arrays.stream(tree.split(""))
                    .filter(s -> skills.contains(s))
                    .map(s -> skills.indexOf(s))
                    .collect(Collectors.toList());

            int idx = 0;
            boolean flag = true;
            for(int j = 0; j < collect.size(); j++){
                if(idx == collect.get(j)) {
                    idx++;
                } else {
                    flag = false;
                    break;
                }
            }

            if(flag) result++;
        }

        return result;
    }
}