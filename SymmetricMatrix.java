package haneena;
import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        // Check if the matrix is square
        if (rows != cols) {
            System.out.println("A symmetric matrix must be square (rows = columns).");
            return;
        }
        
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        boolean isSymmetric = true;
        
        // Check symmetry: compare elements above and below the diagonal
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) { // j starts from i+1 to avoid redundant checks
                if (matrix[i][j] != matrix[j][i]) { // compare symmetric positions
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
