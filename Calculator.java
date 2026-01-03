import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b;
        int choice;

        try {
            System.out.print("Enter first number: ");
            a = sc.nextDouble();

            System.out.print("Enter second number: ");
            b = sc.nextDouble();

            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result = " + (a / b));
                    }
                    break;

                case 5:
                    if (b == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        System.out.println("Result = " + (a % b));
                    }
                    break;

                case 6:
                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }

        sc.close();
    }
}
