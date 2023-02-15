import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int max = input.nextInt();

        printNum(max);
    }

    /*
     * Write a method called printNum that prints each number
     * from 1 to a given maximum, with each number separated by a comma
     * Sample output for printNum(5): 1, 2, 3, 4, 5
     */
    public static void printNum(int max) {
        int val = 1;
        while (val <= max) {
            System.out.print(val + ", ");
            ++val;
        }
    }
}
