package harinsalai.ratchanon.lab4;

import java.util.Scanner;

public class MatrixDisplay {
    static int[][] matrix;
    static int rowDimension, columnDimension;

    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByRowZigzag();
    }

    //create scanner
    static Scanner scan = new Scanner(System.in);

    private static void inputMatrix() {
        System.out.println("Enter number of row then number of column of a matrix:");
        boolean fillMatrix = false;

        //loop for row and column dimension must > 0
        while (fillMatrix == false) {
            rowDimension = scan.nextInt();
            columnDimension = scan.nextInt();
            if (rowDimension <= 0 || columnDimension <= 0) {
                System.out.println("Number of column and row must be positive.");

            } else if (rowDimension > 0 && columnDimension > 0) {
                //set size for row and column dimension
                matrix = new int[rowDimension][columnDimension];
                System.out.println("Enter your matrix by row");

                //row loop
                for (int i = 0; i < rowDimension; i++) {
                    //column loop
                    for (int j = 0; j < columnDimension; j++) {
                        matrix[i][j] = scan.nextInt();
                    }
                }
                //fill complete
                fillMatrix = true;
            }
        }
    }

    private static void showMatrix() {
        System.out.println("Showing original matrix:");
        //row loop
        for (int i = 0; i < rowDimension; i++) {
            //column loop
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void showMatrixByRow() {
        System.out.print("Showing matrix by rows: ");
        //row loop
        for (int i = 0; i < rowDimension; i++) {
            //column loop
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void showMatrixByColumn() {
        System.out.print("Showing matrix by columns: ");
        //column loop
        for (int j = 0; j < columnDimension; j++) {
            // row loop
            for (int i = 0; i < rowDimension; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void showMatrixByRowBackward() {
        System.out.print("Showing matrix by row backward: ");
        //row loop
        for (int i = rowDimension - 1; i >= 0; i--) {
            //column loop
            for (int j = columnDimension - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

    private static void showMatrixByColumnBackward() {
        System.out.print("Showing matrix by column backward: ");
        for (int j = columnDimension - 1; j >= 0; j--) {
            for (int i = rowDimension - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

    private static void showMatrixByRowZigzag() {
        System.out.print("Showing matrix by row zigzag: ");
        for (int i = 0; i < rowDimension; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columnDimension; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for (int j = rowDimension-1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }

                }
            }

        System.out.println(" ");
    }
}