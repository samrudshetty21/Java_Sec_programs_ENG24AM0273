import java.util.Scanner;

public class Prog6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // get the last digit
            reversed = reversed * 10 + digit; // add it to reversed number
            num = num / 10; // remove the last digit
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
