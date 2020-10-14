package soccer;

import java.util.Random;

public class League {
    
    private static final int TOTAL_PLAYERS = 6;
    private static final int GAME_TIME = 50;
    
    public static void main(String[] args) {
        System.out.println("League begins");
        
        //Initiate teams
        Team team1 = createTeam1();
        Team team2 = createTeam2();
        
        //Print teams
        System.out.println(team1);
        System.out.println(team2);
        
        //Initiate game
        startGame(team1, team2);
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
    
    public static void startGame(Team homeTeam, Team awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        
        long start = System.currentTimeMillis();
        Random r = new Random(start);
        Team scoringTeam;
        long scoreTime;
        int teamRand, playerIndex;
        for(int i = 0; i < GAME_TIME; i++) {
            scoringTeam = null;
            teamRand = r.nextInt(3);
            if (teamRand == 1) {
                scoringTeam = game.getHomeTeam();
            } else if (teamRand == 2) {
                scoringTeam = game.getAwayTeam();
            }
            if(scoringTeam != null) {
                scoreTime = System.currentTimeMillis();
                playerIndex = r.nextInt(TOTAL_PLAYERS);
                game.addGoal(new Goal(scoringTeam, 
                    scoringTeam.getPlayers()[playerIndex], 
                    (double)(scoreTime - start)));
            }
        }
        
        System.out.println(game);
    }
}
