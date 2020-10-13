public class Main {
    
    public static void main(String[] args) {
        String custName = "Nimia", itemDesc = "Shirt", message;
        double price = 29.99, tax = 1.04, total;
        int quantity = 2;
        boolean outOfStock = false;
        
        message = custName + " wants to purchase " + itemDesc.length() + " item";
        if (quantity > 1) {
            message += "s";
        }
        total = (quantity * price) * tax;
        
        if (outOfStock) {
            System.out.println("There is no stock for this item");
        } else {
            System.out.println(message);
            System.out.println("Total cost with tax is: " +  total + ".");
        }
    }
}