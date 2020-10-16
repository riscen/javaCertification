import java.util.ArrayList;

public class ShoppingCart {
    
    public static void main(String[] args) {
        Item shirt = new Shirt(19.99, 'S', 'B');
        shirt.displayItem();
        if (shirt instanceof Shirt) {
            System.out.println(((Shirt)shirt).getColor()); 
        } else {
            System.out.println("This object is not an instance of Shirt");
        }
    }
}
