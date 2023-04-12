public class StudentWithName {
    public static void main(String[] args) {
        // TODO: PRACTICE method calls: constructors, getters, setters, toString, equals

        // TODO: Construct a Student object
        //Name n = new Name("Gina", 'R', "Bai");
        Student s = new Student(new Name("Gina", 'R', "Bai"), "000123", 2026);

        // TODO: Print out this student's first name with getter method
        System.out.println(s.getStuName().getFirstName());

        // TODO: Print out this student's middle initial with getter method

        // TODO: Print out this student's last name with getter method

        // TODO: Rename this student's first name with setter method

        // TODO: Rename this student's middle initial with setter method

        // TODO: Rename this student's last name with setter method

        // TODO: Print out this student's full name with toString() after renaming

        // TODO: Construct another Student object

        // TODO: Check if these two students have the same name

        // TODO: Be creative!!! Try out the getter and setter methods in Student.java
        // TODO: Be creative!!! Add more fields and methods to Student.java, make this Student object more like a student!

    }
}
