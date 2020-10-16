public class Item {
    
    public int id;
    public String descr;
    public double price;
    public int quantity;
    private char color;
    
    public Item() {
    }
    
    public Item(String descr, double price, int quantity, char color) {
        setItemFields(descr, price, quantity, color);
    }
    
    public int setItemFields(String descr, double price, int quantity, char color) {
        if (color == ' ') {
            return -1;
        }
        this.color = color;
        this.descr = descr;
        this.price = price;
        this.quantity = quantity;
        return 1;
    }
    
    public boolean isOutOfStock() {
        return quantity == 0;
    }
    
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        }
        color = colorCode;
        return true;
    }
    
    public void displayItem() {
        System.out.println("Item: " + descr + ", " + quantity + ", "  + price + 
           ", " + color);
    }
}