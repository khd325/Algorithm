import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String player = callings[i];

            int rank = map.get(player);
            players[rank] = players[rank - 1];
            players[rank - 1] = player;

            map.put(players[rank], rank);
            map.put(players[rank - 1], rank - 1);
        }

        return players;
    }
}