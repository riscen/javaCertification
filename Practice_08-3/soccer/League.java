package soccer;

import java.util.ArrayList;

public class League {
    
    private static final int TOTAL_PLAYERS = 6;
    private static final int GAME_TIME = 50;
    
    public static void main(String[] args) {
        System.out.println("League begins");
        
        //Create teams
        ArrayList<Team> teams = createTeams();
        
        //Create game
        Game game = createGame(teams);
        
        //Play game
        game.playGame();
        
        //Display results
        System.out.println(game);
    }
    
    public static ArrayList<Team> createTeams() {
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(createTeam1());
        teams.add(createTeam2());
        return teams;
    }
    
    public static Game createGame(ArrayList<Team> teams) {
        return new Game(teams.get(0), teams.get(1));
    }
    
    public static void printTeamRoster(Team team){
        Player[] players = team.getPlayers();
        int spaceIndex;
        String completeName, lastName;
        System.out.println("Team: " + team.getName());
        for(Player player : players) {
            completeName = player.getName();
            spaceIndex = completeName.indexOf(" ");
            System.out.println("\t" + completeName.substring(spaceIndex + 1) + ", " + completeName.substring(0, spaceIndex));
        }
    }
    
    public static Team createTeam1() {
        Team team = new Team("Reds", TOTAL_PLAYERS);
        team.addPlayer(new Player("Robert Service", 10));
        team.addPlayer(new Player("Raul Sanchez", 11));
        team.addPlayer(new Player("Rigo Pepe", 12));
        team.addPlayer(new Player("Ramon Don", 13));
        team.addPlayer(new Player("Roberto Servicio", 14));
        team.addPlayer(new Player("Rivan Contreras", 15));
        return team;
    }
    
    public static Team createTeam2() {
        Team team = new Team("Blues", TOTAL_PLAYERS);
        team.addPlayer(new Player("Bobert Service", 1));
        team.addPlayer(new Player("Baul Sanchez", 2));
        team.addPlayer(new Player("Bigo Pepe", 3));
        team.addPlayer(new Player("Bamon Don", 4));
        team.addPlayer(new Player("Boberto Servicio", 5));
        team.addPlayer(new Player("Bivan Contreras", 6));
        return team;
    }
}
