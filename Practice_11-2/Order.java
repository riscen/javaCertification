public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    String stateCode;
    double total;
    double discount;
    char custType;
    
    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void calcDiscount() {
        double discount = 0;
        switch (custType) {
            case CORP:
                discount = (total > 900) ? 8 : 5;
                break;
            case PRIVATE:
                discount = (total > 900) ? 7 : 0;
                break;
            case NONPROFIT:
                discount = (total > 900) ? 10 : 5;
                break;
            default:
                System.out.println("Invalid customer type.");
                break;
        }
        this.discount = discount;
    }
}