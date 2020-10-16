package soccer;

import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int points;
    private int totalGoals;
    
    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
        points = 0;
        totalGoals = 0;
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

    public void addGoals(int goals) {
        totalGoals += goals;
    }
    
    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addPoints(int points) {
        this.points += points;
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
    
    public int getTotalGoals() {
        return totalGoals;
    }
    
    public int getPoints() {
        return points;
    }
    
    public String toString() {
        String teamInfo;
        teamInfo = name + ":\n";
        for (Player player : players) {
            teamInfo += "\t" + player + "\n";
        }
        teamInfo += "Total points: " + points;
        teamInfo += "Total goals scored: " + totalGoals;
        return teamInfo;
    }
}