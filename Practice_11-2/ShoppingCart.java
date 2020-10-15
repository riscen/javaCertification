public class ShoppingCart {
    
    public static void main(String[] args) {
        Order o = new Order("Shirt", 950, "WA", Order.CORP);
        
        o.calcDiscount();
        
        System.out.println(o.getDiscount());
    }
}
