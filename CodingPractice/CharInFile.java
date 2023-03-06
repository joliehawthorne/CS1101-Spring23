import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharInFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        // TODO: Process the file via line-based processing
        // HINT: No need to tokenize the line in this programming problem
        
        Scanner fileScnr = new Scanner(new File("data.txt"));
    }
}

/*
 ********* Sample output *********
 
 Line 1 contains 6 digits, 3 uppercase letters, 5 lowercase letters, and 3 spaces.
 Line 2 contains 2 digits, 1 uppercase letters, 3 lowercase letters, and 11 spaces.
 Line 3 contains 4 digits, 2 uppercase letters, 0 lowercase letters, and 0 spaces.
 */
