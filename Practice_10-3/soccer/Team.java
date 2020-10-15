package soccer;

import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList<Player> players;
    
    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }
    
    public Team(String name, ArrayList<Player> players) {
        setName(name);
        setPlayers(players);
    }
    
    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public ArrayList<Player> getPlayers() {
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