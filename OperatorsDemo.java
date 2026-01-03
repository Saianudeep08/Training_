public class OperatorsDemo {
    public static void main(String[] args) {

        // Arithmetic operators
        int a = 10, b = 3;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b; // integer division
        int rem = a % b; // remainder

        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("prod = " + prod);
        System.out.println("quot = " + quot);
        System.out.println("rem = " + rem);

        // Precedence example
        int p1 = 2 + 3 * 4; // 14
        int p2 = (2 + 3) * 4; // 20
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // Relational operators
        System.out.println("a == b? " + (a == b));
        System.out.println("a != b? " + (a != b));
        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a >= b? " + (a >= b));
        System.out.println("a <= b? " + (a <= b));

        // Logical operators
        boolean cond1 = a > 5;
        boolean cond2 = b < 5;
        System.out.println("cond1 && cond2 = " + (cond1 && cond2));
        System.out.println("cond1 || cond2 = " + (cond1 || cond2));
        System.out.println("!cond1 = " + (!cond1));

        // Assignment and shorthand
        int x = 5;
        x += 3; // 8
        x -= 2; // 6
        x *= 4; // 24
        x /= 6; // 4
        x %= 3; // 1
        System.out.println("x after shorthand ops = " + x);

        // Practice: BMI
        double weightKg = 68.0;
        double heightM = 1.70;
        double bmi = weightKg / (heightM * heightM);
        System.out.println("BMI = " + bmi);

        // Practice: age in days
        int ageYears = 21;
        int ageDays = ageYears * 365;
        System.out.println("Age in days ≈ " + ageDays);
    }
}
