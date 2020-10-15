package soccer;

import java.util.Random;
import java.util.ArrayList;

import utility.GamesUtils;

public class Game {
    
    public final int MAX_GOALS_DEFAULT = 5;
    
    private Team homeTeam;
    private Team awayTeam;
    private ArrayList<Goal> goals;
    
    public Game(Team homeTeam, Team awayTeam) {
        setHomeTeam(homeTeam);
        setAwayTeam(awayTeam);
        goals = new ArrayList<>();
    }
    
    public void setHomeTeam(Team team) {
        homeTeam = team;
    }
    
    public void setAwayTeam(Team team) {
        awayTeam = team;
    }
    
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    
    public Team getHomeTeam() {
        return homeTeam;
    }
    
    public Team getAwayTeam() {
        return awayTeam;
    }
    
    public ArrayList<Goal> getGoals() {
        return goals;
    }
    
    public void playGame() {
        playGame(MAX_GOALS_DEFAULT);
    }
    
    public void playGame(int maximumGoals) {
        long start = System.currentTimeMillis();
        Random r = new Random(start);
        Team scoringTeam;
        long scoreTime;
        double scoringMinute = 0;
        int teamRand, playerIndex, totalPlayers = getHomeTeam().getPlayers().size();
        for(int i = 0; i < maximumGoals; i++) {
            teamRand = r.nextInt(2);
            scoringTeam = (teamRand % 2 == 0)? getHomeTeam() : getAwayTeam();
            scoringMinute = GamesUtils.getGoalMinute(scoringMinute);
            scoreTime = System.currentTimeMillis();
            playerIndex = r.nextInt(totalPlayers);
            addGoal(new Goal(scoringTeam, 
                scoringTeam.getPlayers().get(playerIndex), 
                scoringMinute));
        }
    }
    
    public String toString() {
        String gameInfo = getHomeTeam().getName() + " vs " + 
            getAwayTeam().getName() + "\n";
        gameInfo += "Goals:\n";
        for (Goal goal : goals) {
            gameInfo += "\t" + goal + "\n";
        }
        return gameInfo;
    }
}