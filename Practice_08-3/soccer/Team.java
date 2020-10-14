package soccer;

import java.util.ArrayList;

public class Team {
    
    private String name;
    private Player[] players;
    private int playerIndex;
    
    public Team(String name, int totalPlayers) {
        setName(name);
        players = new Player[totalPlayers];
    }
    
    public boolean addPlayer(Player player) {
        if (playerIndex == players.length) {
            return false;
        }
        players[playerIndex] = player;
        playerIndex++;
        return true;
    }
    
    public Player[] getPlayers() {
        return players;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Player> searchPlayerOverLastName(String lastNameFragment) {
        ArrayList<Player> playersFound = new ArrayList<>();
        String name, lastName;
        for (Player player : players) {
            name = player.getName();
            lastName = name.substring(name.indexOf(" ") + 1);
            if (lastName.contains(lastNameFragment)) {
                playersFound.add(player);
            }
        }
        return playersFound;
    }
    
    public String toString() {
        String teamInfo;
        teamInfo = name + ":\n";
        for (Player player : players) {
            teamInfo += "\t" + player + "\n";
        }
        return teamInfo;
    }
}