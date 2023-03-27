import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class RemoveSpaces {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter file name: ");
        String fileName = console.nextLine().trim();

        File inputFile = new File(fileName);
        
        // TODO: Use a while loop to validte the input file name
        while(____________________){
            System.out.print("Input file does not exist, try again: ");
            fileName = ___________________________;
            inputFile = new File(fileName);
        }
        // TODO: Construct a Scanner to read the input file
        Scanner input = ______________________;
        
        // Specify the output file name
        File outputFile = new File("poemNoSpace.txt");
        
        // TODO: Use an if statement to check whether the output file already exists
        if (____________________) {
            System.out.println("poemNoSpace.txt already exists!");
            System.exit(1);
        }
        // TODO: Construct a PrintStream to print to the output file
        PrintStream output = ____________________;
        
        while (input.hasNextLine()) {
            // TODO: Line-based processing
        }
        
        input.close();  // Close the Scanner for the input file
        output.close(); // Close the PrintStream for the output file
    }
}
