public class ShoppingCart {
    
    public static void main(String[] args) {
        String customerName = "Nimia Rodriguez";
        int spaceIdx = customerName.indexOf(" ");
        String firstName = customerName.substring(0, spaceIdx), 
            lastName = customerName.substring(spaceIdx + 1);
            
        StringBuilder name = new StringBuilder(firstName);
        name.append(" ");
        name.append(lastName);
            
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        
        System.out.println("Complete name: " + name);
    }
}