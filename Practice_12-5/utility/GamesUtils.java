package utility;

import java.util.Random;
import java.util.ArrayList;

public class GamesUtils {
    
    public static final double MATCH_TIME = 120;
    
    public static double getGoalMinute(double prevMinute) {
        Random r = new Random(System.currentTimeMillis());
        double minute;
        do {
            minute = r.nextDouble() * MATCH_TIME;
        } while (minute <= prevMinute);
        return minute;
    }
    
    public static ArrayList<Integer> getRandonRosterNumbers(int totalPlayers) {
        Random r = new Random(System.currentTimeMillis());
        ArrayList<Integer> chosenNumbers = new ArrayList<>();
        while (totalPlayers-- > 0) {
            chosenNumbers.add(r.nextInt(200));
        }
        return chosenNumbers;
    }
    
    public static String getTeamName() {
        String[] names = {
            "En Fuego CF",
            "Rush Hour",
            "Hooligans FC",
            "Team Avengers",
            "Inter Real Hustlers FC",
            "Amigos",
            "Thunder",
            "Terminators",
            "Outkast",
            "Lazers",
            "Atlas",
            "Leones Negros de la UdG",
            "Chivas",
            "Barcelona",
            "America",
            "Lyon gaming",
            "SKT T1",
            "G2",
            "TSM",
            "CLG",
            "Cloud9",
            "Raimbow 7",
            "Invictus Gaming"
        };
        return getRandomStringElement(names);
    }
    
    public static ArrayList<String> getRandomRoster(int totalPlayers) {
        String[] names = {
            "John Swift",
            "Wojciech Szczesny",
            "Alexis Sánchez",
            "José Enrique Sánchez Díaz",
            "Adel Taarabt",
            "Dusan Tadic",
            "Alan Tate",
            "Adilson Cabral Tavares Varela",
            "Matthew Taylor",
            "Neil Taylor",
            "Ryan Taylor",
            "Steven Taylor",
            "Gary Taylor-Fletcher",
            "Dionatan do Nascimento Teixeira",
            "John Terry",
            "Jerome Thomas",
            "Dwight Tiendalli",
            "Ismael Tioté",
            "James Tomkins",
            "Aleksandar Tonev",
            "Fernando Torres",
            "Kolo Touré",
            "Yaya Touré",
            "Andros Townsend",
            "Conor Townsend",
            "Armand Traore",
            "Gerhard Tremmel",
            "Keiran Trippier",
            "José Leonardo Ulloa",
            "Matthew Upson",
            "Antonio Valencia",
            "Enner Valencia",
            "Patrick Van Aanholt",
            "Marco van Ginkel",
            "Robin van Persie",
            "Jamie Vardy",
            "Gullermo Varela",
            "Ricardo Vaz Te",
            "Milos Veljkovic",
            "Thomas Vermaelen",
            "Jan Vertonghen",
            " Vilaça Teixeira",
            "Ron Vlaar",
            "Sam Vokes",
            "Michel Vorm",
            "Haris Vuckic",
            "Theo Walcott",
            "Kyle Walker",
            "Ross Wallace",
            "Jonathan Walters"
        };
        ArrayList<String> chosenNames = new ArrayList<>();
        while (totalPlayers-- > 0) {
            chosenNames.add(getRandomStringElement(names));
        }
        return chosenNames;
    }
    
    private static String getRandomStringElement(String[] list) {
        Random r = new Random();
        return list[r.nextInt(list.length)];
    }
}