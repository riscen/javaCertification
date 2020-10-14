package soccer;

public class Game {
    
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