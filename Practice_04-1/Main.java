public class Main {
    
    public static void main(String[] args) {
        String custName = "Nimia", itemDesc = "Shirt", message;
        double price = 29.99, tax = 1.04, total;
        int quantity = 2;
        message = custName + " wants to purchase a " + quantity + " " + itemDesc;
        total = (quantity * price) * tax;
        System.out.println(message);
        System.out.println("Total cost with tax is: " + total + ".");
    }
}