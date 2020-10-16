import java.util.ArrayList;

public class ShoppingCart {
    
    public static void main(String[] args) {
        double total = 0;
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Shirt", 10.0, 1, 'G'));
        items.add(new Item("Jeans", 19.99, 3, 'B'));
        items.add(new Item("Sweater", 15.5, 0, 'R'));
        items.add(new Item("Socks", 10.0, 100, 'C'));
        
        for (Item item : items) {
            if (!item.isOutOfStock()) {
                item.displayItem();
                total += item.price;
            }
        }
        
        System.out.println("Total: " + total);
    }
}
