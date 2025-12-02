public class Prog14 {

    public static void main(String[] args) {
        // BREAK statement
        System.out.println("== Break Statement ==");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break; // exits the loop when i = 3
            System.out.println("i = " + i);
        }

        // CONTINUE statement
        System.out.println("\n== Continue Statement ==");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue; // skips the rest of the loop when i = 3
            System.out.println("i = " + i);
        }

        // RETURN statement
        System.out.println("\n== Return Statement ==");
        showReturnExample();

        // GOTO statement (not in Java)
        System.out.println("\n== Goto Statement ==");
        System.out.println("Java does not support 'goto' — it’s a reserved keyword but unused.");
    }

    static void showReturnExample() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Returning when i = " + i);
                return; // exits the method completely
            }
            System.out.println("i = " + i);
        }
    }
}
