import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass {
    
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        
        System.out.println("Order date: " + date);
        
        String dateStr = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: " + dateStr);
        
        if (args.length < 2) {
            System.out.println("Two arguments are required");
            return;
        }
        int age = Integer.parseInt(args[1]);
        System.out.println("Name: " + args[0]);
        System.out.println("Age: " + age);
    }
}