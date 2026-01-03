import java.util.Scanner;
import java.util.Random;

public class DoWhileGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int guess;

        System.out.println("=== Number Guessing Game ===");

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("Too low, try again!");
            } else if (guess > secret) {
                System.out.println("Too high, try again!");
            }
        } while (guess != secret);

        System.out.println("Correct! The number was " + secret);
        scanner.close();
    }
}