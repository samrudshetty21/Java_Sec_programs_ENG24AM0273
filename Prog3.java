public class Prog3 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.75;

        // Implicit type casting (int → double)
        double result1 = num1;
        System.out.println("Implicit casting (int to double): " + result1);

        // Explicit type casting (double → int)
        int result2 = (int) num2;
        System.out.println("Explicit casting (double to int): " + result2);
    }
}
