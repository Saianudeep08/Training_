import java.util.Scanner;

public class PatternGenerator {

    // 1. Right triangle of stars
    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Pyramid of stars
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Inverted pyramid of stars
    static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Number pattern: 1, 12, 123, ...
    static void increasingNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 5. Diamond pattern
    static void diamond(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Floyd's triangle
    static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 7. Pascal's triangle
    static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Pattern Generator Menu =====");
            System.out.println("1. Right triangle of stars");
            System.out.println("2. Pyramid of stars");
            System.out.println("3. Inverted pyramid of stars");
            System.out.println("4. Number pattern (1, 12, 123, ...)");
            System.out.println("5. Diamond pattern");
            System.out.println("6. Floyd's triangle");
            System.out.println("7. Pascal's triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Pattern Generator. Goodbye!");
                break;
            }

            System.out.print("Enter number of rows (n): ");
            int n = sc.nextInt();

            switch (choice) {
                case 1:
                    rightTriangle(n);
                    break;
                case 2:
                    pyramid(n);
                    break;
                case 3:
                    invertedPyramid(n);
                    break;
                case 4:
                    increasingNumberPattern(n);
                    break;
                case 5:
                    diamond(n);
                    break;
                case 6:
                    floydsTriangle(n);
                    break;
                case 7:
                    pascalsTriangle(n);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (true);

        sc.close();
    }
}
