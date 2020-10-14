package soccer;

import java.util.Random;

import utility.GamesUtils;

public class Game {
    
    private final int MAX_GOALS_DEFAULT = 6;
    
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    public Game(Team homeTeam, Team awayTeam) {
        setHomeTeam(homeTeam);
        setAwayTeam(awayTeam);
        goals = new Goal[0];
    }
    
    public void setHomeTeam(Team team) {
        homeTeam = team;
    }
    
    public void setAwayTeam(Team team) {
        awayTeam = team;
    }
    
    public void addGoal(Goal goal) {
        int currentGoals = goals.length, i;
        Goal[] newGoals = new Goal[currentGoals + 1];
        for(i = 0; i < goals.length; i++) {
            newGoals[i] = goals[i];
        }
        newGoals[i] = goal;
        goals = newGoals;
    }
    
    public Team getHomeTeam() {
        return homeTeam;
    }
    
    public Team getAwayTeam() {
        return awayTeam;
    }
    
    public Goal[] getGoals() {
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
        int teamRand, playerIndex, totalPlayers = getHomeTeam().getPlayers().length;
        for(int i = 0; i < maximumGoals;) {
            scoringTeam = null;
            teamRand = r.nextInt(2);
            if (teamRand == 0) {
                scoringTeam = getHomeTeam();
            } else {
                scoringTeam = getAwayTeam();
            }
            if(scoringTeam != null) {
                scoringMinute = GamesUtils.getGoalMinute(scoringMinute);
                scoreTime = System.currentTimeMillis();
                playerIndex = r.nextInt(totalPlayers);
                addGoal(new Goal(scoringTeam, 
                    scoringTeam.getPlayers()[playerIndex], 
                    scoringMinute));
                i++;
            }
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