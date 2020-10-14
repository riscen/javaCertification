public class ShoppingCart {
    
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        
        if (!item1.setColor(' ')) {
            System.out.println("Invalid color");
        }
        
        if(item1.setItemFields("Shirt", 99.99, 1, 'B') < 0){
            System.out.println("Invalid color code");
        } else {
            item1.displayItem();
        }
        
    }
}
