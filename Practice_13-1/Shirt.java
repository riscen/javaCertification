public class Shirt extends Item {
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        
        setSize(size);
        setColorCode(colorCode);
    }
    
    public void setSize(char size) {
        this.size = size;
    }
    
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    
    public String getColor() {
        String color = "";
        switch(colorCode) {
            case 'R':
                color = "Red";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'Y':
                color = "Yellow";
                break;
            default:
                System.out.println("Not a valid colorCode");
        }
        return color;
    }
    
    public void displayItem() {
        super.displayItem();
        System.out.println("Size: " + size);
        System.out.println("Color: " + colorCode);
    }
}