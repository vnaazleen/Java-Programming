import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows in matrix 1: ");
        int r1 = input.nextInt();
        System.out.print("Enter number of cols in matrix 1: ");
        int c1 = input.nextInt();

        System.out.print("Enter number of rows in matrix 2: ");
        int r2 = input.nextInt();
        System.out.print("Enter number of cols in matrix 2: ");
        int c2 = input.nextInt();

        if (c1 == r2) {

            int[][] matrix1 = new int[r1][c1];
            int[][] matrix2 = new int[r2][c2];

            int[][] result = new int[r1][c2];

            /* input matrix 1 */
            System.out.println("Enter matrix 1: ");
            for (int r = 0; r < r1; r++) {
                for (int c = 0; c < c1; c++) {
                    matrix1[r][c] = input.nextInt();
                }
            }

            /** Input matrix 2 */
            System.out.println("Enter matrix 2: ");
            for (int r = 0; r < r2; r++) {
                for (int c = 0; c < c2; c++) {
                    matrix2[r][c] = input.nextInt();
                }
            }

            /* Multiplying matrix 1 and matrix 2 */
            for (int r = 0; r < r1; r++) {
                for (int c = 0; c < c2; c++) {
                    for (int k = 0; k < r2; k++) {
                        result[r][c] += matrix1[r][k] * matrix2[k][c];
                    }
                }
            }

            /** Printing result */
            System.out.println("Resultant matrix: ");
            for (int r = 0; r < r1; r++) {
                for (int c = 0; c < c2; c++) {
                    System.out.print(result[r][c] + " ");
                }
                System.out.println();
            }


        } else {
            System.out.println("Matrix multiplication for given two matrixs isn't possible :(");
        }

    }
}
