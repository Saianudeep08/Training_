import java.util.Scanner;

public class GradeCalculator {

    public static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            return;
        }

        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks should be between 0 and 100.");
            return;
        }

        char grade = calculateGrade(marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}