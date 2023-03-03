import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("grades.txt"));
        processGrade(input);
    }

    public static void processGrade(Scanner input) {
        // TODO: While there is one more token in the file
        while (    ) {

            // TODO: Read in the first token in each line as a String (student name)
            String stuName =          ; // TODO: complete the statement

            double total = 0;

            // TODO: Add up all doubles until the Scanner sees another student name
            while (    ) {
                // TODO: complete the while loop
            }

            System.out.println(stuName + ": " + total);
        }

        input.close();  // Close the Scanner for the input file
    }
}
