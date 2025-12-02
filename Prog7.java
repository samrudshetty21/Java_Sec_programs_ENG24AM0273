import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine(); // reads a full line of text

        System.out.println("You entered: " + text);

        sc.close();
    }
}
