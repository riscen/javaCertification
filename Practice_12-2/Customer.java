public class Customer {
    
    private String name;
    private String ssn;
    
    public Customer() {};
    
    public Customer(String name, String ssn) {
        setName(name);
        this.ssn = ssn;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSSN() {
        return ssn;
    }
    
    public String toString() {
        return getName() + " - " + getSSN();
    }
}