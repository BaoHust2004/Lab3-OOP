import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        System.out.println("Do you want to enter matrices manually or use constants? (1 for manual, 2 for constants)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter elements for Matrix 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements for Matrix 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Matrix1[i][j]:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix2[i][j]:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Using constant matrices(Matrix1[i][j])");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix1[i][j] = i + j;
                    matrix2[i][j] = i + 2*j;
                }
            }
            System.out.println("Matrix1[i][j]=i+j:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix2[i][j]=i+2j:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
