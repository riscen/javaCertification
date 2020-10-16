import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestClass {
    
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Thursday", "Wednesday", "Tuesday", "Friday", "Saturday"};
        
        //Convert array to ArrayList
        List<String> daysArr = new ArrayList<>(Arrays.asList(days));
        
        System.out.println(daysArr);
        
        for(String day : daysArr) {
            if(day.equals("Sunday")) { 
                System.out.println(day.toUpperCase());
            }
        }
        
        System.out.println(daysArr);
    }
} 