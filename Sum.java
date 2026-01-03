public class Sum {
    public static void main(String[] args) {
        int a = 13;
        int sum = 0;
        while (a != 0) {
            a = (a % 10);
            sum = sum + a;
            a = a / 10;

        }
        System.out.println(sum);
    }
}
