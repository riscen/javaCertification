public class ShoppingCart {
    
    public static void main(String[] args) {
        String[] itemsDesc = {"Shirt", "Jeans", "Snickers", "Sweater"};
        String custName = "Nimia", itemDesc = "Shirt", message;

        message = custName + " wants to purchase the following items:";
        
        System.out.println(message);
        for (String item : itemsDesc) {
            System.out.println("\tItem purchased: " + item);
        }
    }
}