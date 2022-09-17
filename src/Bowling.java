import java.util.*;
import java.util.Map;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public String getWinner(){
        int winnerScore = (Collections.max(players.values()));
        String winner = "";
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue().equals(winnerScore)) {
                winner = (entry.getKey());
            }
        } return winner;

        }
}

