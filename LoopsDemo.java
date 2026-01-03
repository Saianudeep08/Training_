import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (0 or above): ");
        int age = sc.nextInt();

        while (age < 0) { // input validation loop
            System.out.println("Invalid age. Please enter a non-negative age:");
            age = sc.nextInt();
        }

        System.out.println("You entered valid age: " + age);

        sc.close();
    }
}
