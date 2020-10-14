package soccer;

public class Goal {
    
    private Team scoringTeam;
    private Player scoringPlayer;
    private double scoringTime;
    
    public Goal(Team team, Player player, double time) {
        setScoringTeam(team);
        setScoringPlayer(player);
        setScoringTime(time);
    }
    
    public void setScoringTeam(Team team) {
        scoringTeam = team;
    }
    
    public void setScoringPlayer(Player player) {
        scoringPlayer = player;
    }
    
    public void setScoringTime(double time) {
        scoringTime = time;
    }
    
    public Team getScoringTeam() {
        return scoringTeam;
    }
    
    public Player getScoringPlayer() {
        return scoringPlayer;
    }
    
    public double getScoringTime() {
        return scoringTime;
    }
    
    public String toString() {
        return "Goal scored after " + getScoringTime() + " mins by " + 
            getScoringPlayer().getName() + " of the " + 
            getScoringTeam().getName();
    }
}