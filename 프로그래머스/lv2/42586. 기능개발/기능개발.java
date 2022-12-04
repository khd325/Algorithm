import java.util.*;

class Solution {
    
    static class Node {
        int progress;
        int speed;


        public Node(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }
    }
    
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> arr = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            q.add(new Node(progresses[i], speeds[i]));
        }

        while (!q.isEmpty()) {

            if (q.peek().progress >= 100) {
                int temp = 0;
                while (!q.isEmpty() && q.peek().progress >= 100) {
                    q.poll();
                    temp++;
                }
                arr.add(temp);
            }
            int size = q.size();


            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                q.add(new Node(node.progress + node.speed, node.speed));
            }
        }
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }
        
        return result;
    }
}