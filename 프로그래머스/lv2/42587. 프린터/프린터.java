import java.util.*;

class Solution {
    static class Node {
        int idx;
        int priority;

        public Node(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
         int answer = 0;
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            q.add(new Node(i, priorities[i]));
        }

        while (!q.isEmpty()) {
            int max = q.stream().max(Comparator.comparing(node -> node.priority)).get().priority;

            Node node = q.poll();

            if(node.priority == max) {
                answer++;
                if(node.idx == location) {
                    break;
                }
            } else {
                q.add(new Node(node.idx,node.priority));
            }
        }
        return answer;
    }
}