import java.util.Scanner;

public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows in Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows in Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix B: ");
        int c2 = sc.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! (Columns of A must equal rows of B)");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Input for matrix A
        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input for matrix B
        System.out.println("\nEnter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiplying matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("\nResultant Matrix (A × B):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
