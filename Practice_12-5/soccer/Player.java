package soccer;

public class Player {
    private String name;
    private int number;
    
    public Player() {
        setName("John Doe");
        setNumber(0);
    }
    
    public Player(String name, int number) {
        setName(name);
        setNumber(number);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String toString() {
        return getName() + " with number " + getNumber();
    }
}