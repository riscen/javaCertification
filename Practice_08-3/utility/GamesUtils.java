package utility;

import java.util.Random;

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
}