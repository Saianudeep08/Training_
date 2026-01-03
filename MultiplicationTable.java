public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;
        int range = 10;

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}