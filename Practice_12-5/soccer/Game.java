package soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.ArrayList;

import utility.GamesUtils;

public class Game {
    
    public final int MAX_GOALS_DEFAULT = 5;
    public final int POINTS_PER_WIN = 2;
    public final int POINTS_PER_DRAW = 1;
    
    private Team homeTeam;
    private Team awayTeam;
    private ArrayList<Goal> goals;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private LocalDateTime date;
    
    public Game(Team homeTeam, Team awayTeam, LocalDateTime date) {
        setHomeTeam(homeTeam);
        setAwayTeam(awayTeam);
        setDate(date);
        goals = new ArrayList<>();
        homeTeamGoals = 0;
        awayTeamGoals = 0;
    }
    
    public void setHomeTeam(Team team) {
        homeTeam = team;
    }
    
    public void setAwayTeam(Team team) {
        awayTeam = team;
    }
    
    public void setDate(LocalDateTime date) {
        this.date = date;
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
    
    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }
    
    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }
    
    public ArrayList<Goal> getGoals() {
        return goals;
    }
    
    public LocalDateTime getDate() {
        return date;
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
            if (teamRand % 2 == 0) {
                scoringTeam = getHomeTeam();
                homeTeamGoals++;
            } else {
                scoringTeam = getAwayTeam();
                awayTeamGoals++;
            }
            scoringMinute = GamesUtils.getGoalMinute(scoringMinute);
            scoreTime = System.currentTimeMillis();
            playerIndex = r.nextInt(totalPlayers);
            addGoal(new Goal(scoringTeam, 
                scoringTeam.getPlayers().get(playerIndex), 
                scoringMinute));
        }
        getHomeTeam().addGoals(homeTeamGoals);
        getAwayTeam().addGoals(awayTeamGoals);
    }
    
    public String getGameResult() {
        String gameResult;
        int homeGoals = getHomeTeamGoals(), awayGoals = getAwayTeamGoals();
        int homeTeamPoints = 0, awayTeamPoints = 0;
        if (homeGoals > awayGoals) {
            homeTeamPoints = POINTS_PER_WIN;
            gameResult = getHomeTeam().getName() + " win ";
        } else if (homeGoals < awayGoals) {
            awayTeamPoints = POINTS_PER_WIN;
            gameResult = getAwayTeam().getName() + " win ";
        } else {
            awayTeamPoints = POINTS_PER_DRAW;
            homeTeamPoints = POINTS_PER_DRAW;
            gameResult = "It's a draw ";
        }
        getAwayTeam().addPoints(awayTeamPoints);
        getHomeTeam().addPoints(homeTeamPoints);
        gameResult += "(" + homeGoals + " - " + awayGoals + ")";
        return gameResult;
    }
    
    public String toString() {
        String gameInfo = getAwayTeam().getName() + " vs " + 
            getHomeTeam().getName() + "\n";
        gameInfo += "Date: " + getDate().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n";
        gameInfo += "Goals:\n";
        for (Goal goal : goals) {
            gameInfo += "\t" + goal + "\n";
        }
        gameInfo += getGameResult();
        return gameInfo;
    }
}