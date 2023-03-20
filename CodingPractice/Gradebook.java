import java.util.Scanner;

public class Gradebook {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many students? ");
        int numStudents = input.nextInt();

        // Construct an array to store students' grades
        double[] exam1 = new double[numStudents];
        
        // Pass the array as a parameter (pass by reference)
        getGrades(exam1, input);

        double average = calcAvg(exam1);
        System.out.println("Average Exam 1 Grade = " + average);

        int numAbove = countAbove(exam1, average);
        System.out.println(numAbove + " students were above average.");

    }

    public static void getGrades (double[] exam1, Scanner input) {
        // TODO: Prompt user for Exam 1 grades for each student
    }

    public static double calcAvg (double[] exam1) {
        // TODO: Traverse the array, calculate the sum and then the average
        
        return 0; // Fix this
    }

    public static int countAbove (double[] exam1, double average){
        // TODO: Traverse the array, compare each element with the average
        
        return 0; // Fix this
    }
}



