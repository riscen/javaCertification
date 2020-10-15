package soccer;

import java.util.Random;
import java.util.ArrayList;
import utility.GamesUtils;

public class League {
    
    private static final int TOTAL_PLAYERS = 6;
    private static final int TOTAL_TEAMS = 8;
    private static final int GAME_TIME = 50;
    
    public static void main(String[] args) {
        System.out.println("League begins");
        
        //Create teams
        ArrayList<Team> teams = createTeams(TOTAL_TEAMS);

        //Create and play games
        playGames(teams);
        
    }
    
    public static ArrayList<Team> createTeams(int totalTeams) {
        ArrayList<Team> teams = new ArrayList<>();
        while (totalTeams-- > 0) {
            teams.add(createTeam(GamesUtils.getTeamName(), 
                GamesUtils.getRandomRoster(TOTAL_PLAYERS), 
                GamesUtils.getRandonRosterNumbers(TOTAL_PLAYERS)));
        }
        return teams;
    }
    
    public static Team createTeam(String name, ArrayList<String> roster, 
        ArrayList<Integer> numbers) {
        Team team = new Team(name);
        for (int i = 0; i < roster.size(); i++) {
            team.addPlayer(new Player(roster.get(i), numbers.get(i)));
        }
        return team;
    }
    
    public static Game createGame(ArrayList<Team> teams) {
        return new Game(teams.get(0), teams.get(1));
    }
    
    public static void playGames(ArrayList<Team> teams) {
        Game game;
        ArrayList<Team> gameTeams;
        Random r = new Random();
        int totalGames = TOTAL_TEAMS / 2, team1Idx, team2Idx;
        while (totalGames-- > 0) {
            gameTeams = new ArrayList<>();
            team1Idx = r.nextInt(TOTAL_TEAMS);;
            do {
                team2Idx = r.nextInt(TOTAL_TEAMS);    
            } while (team2Idx == team1Idx);
            gameTeams.add(teams.get(team1Idx));
            gameTeams.add(teams.get(team2Idx));
            
            game = createGame(gameTeams);
            
            //Play game
            game.playGame(r.nextInt(game.MAX_GOALS_DEFAULT));
            
            //Display results
            System.out.println(game);
        }
    }
    
    public static void printTeamRoster(Team team){
        ArrayList<Player> players = team.getPlayers();
        int spaceIndex;
        String completeName, lastName;
        System.out.println("Team: " + team.getName());
        for(Player player : players) {
            completeName = player.getName();
            spaceIndex = completeName.indexOf(" ");
            System.out.println("\t" + completeName.substring(spaceIndex + 1) + ", " + completeName.substring(0, spaceIndex));
        }
    }
}
