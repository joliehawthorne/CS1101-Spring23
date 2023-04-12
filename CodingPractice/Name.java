public class Name {
    
    // TODO: Javadoc the instance variables and methods
    private String firstName;
    private char middleInitial;
    private String lastName;
    
    public Name(String firstName, char middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public char getMiddleInitial() {
        return middleInitial;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String toString() {
        // TODO: Implement this method
        return "";
    }
    
    public boolean equals(Object obj) {
        // TODO: Implement this method
        return false;
    }
}
