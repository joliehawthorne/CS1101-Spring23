import java.util.Scanner;
import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String userString = __________________; // TODO: complete the statement
        
        // TODO: Use a for loop and charAt() to inialize the char[]
        char[] userArray = new char[userString.length()];
        
        for (int i = 0; i < __________________; ++i) {
            // TODO: Complete the loop
        }
        
        System.out.println("Before swap: " + Arrays.toString(userArray));
        swapPairs(userArray);
        System.out.println("After swap: " + Arrays.toString(userArray));
    }
    
    public static void swapPairs(char[] userArray) {
        // TODO: Complete the method
    }
}
