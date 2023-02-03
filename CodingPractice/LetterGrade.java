import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Grade as whole number: ");
        int grade = input.nextInt();
        
        char letter = ' ';
        
        // TODO: Fix the following if statements
        if(grade >= 90) {
            letter = 'A';
        }
        if(grade >= 80) {
            letter = 'B';
        }
        if(grade >= 70) {
            letter = 'C';
        }
        if(grade >= 60) {
            letter = 'D';
        }
        if(grade < 60) {
            letter = 'F';
        }
        System.out.println("The letter grade is: " + letter);
    }
}

