import java.util.*;

class Node implements Comparable<Node>{
    private int stage;
    private double fail;

    public Node(int stage, double fail) {
        this.stage = stage;
        this.fail = fail;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public int compareTo(Node o) {
        if(this.fail == o.fail){
            return this.stage - o.stage;
        }else{
            return Double.compare(o.fail,this.fail);
        }
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Node> arr = new ArrayList<>();
        int length = stages.length;

        for(int i = 1; i <= N; i++){
            int cnt = 0;
            for(int j = 0; j < stages.length;j++){
                if(stages[j] == i){
                    cnt += 1;
                }
            }

            double fail = 0;
            if(length >= 1){
                fail = (double) cnt / length;
            }

            arr.add(new Node(i,fail));
            length -= cnt;
        }

        Collections.sort(arr);

        for(int i = 0; i < N; i++){
            answer[i] = arr.get(i).getStage();
        }
       return answer;
    }
}