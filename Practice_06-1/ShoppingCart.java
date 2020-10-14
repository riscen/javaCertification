public class ShoppingCart {
    
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.descr = "This is a description for item1";
        item2.descr = "This is a different description for item2";
        
        //item1 = item2;
        
        System.out.println(item1.descr);
        System.out.println(item2.descr);
    }
}
