public class Student {
    
    // TODO: Javadoc the instance variables and methods
    private String stuID;
    private int gradYear;
    private Name stuName;
    
    public Student(Name stuName, String stuID, int gradYear) {
        this.stuName = stuName;
        this.stuID = stuID;
        this.gradYear = gradYear;
    }
    
    public Student(Name stuName) {
        // TODO: Implement this constructor (hint: keyword this)
    }
    
    public Name getStuName() {
        return stuName;
    }
    
    public String getStuID() {
        return stuID;
    }
    
    public int getGradYear() {
        return gradYear;
    }
    
    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    
    public void setGradYear(char gradYear) {
        this.gradYear = gradYear;
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
