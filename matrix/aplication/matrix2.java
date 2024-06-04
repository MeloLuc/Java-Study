package matrix.aplication;

import java.util.Scanner;

public class matrix2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the matrix M X N: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.printf("Enter the numbers of the matrix %d X %d%n", m, n);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("chose one number of the matrix: ");
        int number = sc.nextInt();

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == number) {
                    printInformation(matrix, i, j, number);
                }
            }
        }

        sc.close();
    }

    public static void printInformation(int[][] matrix, int i, int j, int number) {
        System.out.println();
        System.out.printf("---POSITION [%d][%d]---%n",i, j);
        if (i-1 >= 0) {
            System.out.println("UP = " + matrix[i-1][j]);
        }
        if (i+1 <= matrix.length-1) {
            System.out.println("DOWN = " + matrix[i+1][j]);
        }

        if (j-1 >= 0) {
            System.out.println("LEFT = " + matrix[i][j-1]);
        }
        if (j+1 <= matrix[i].length-1) {
            System.out.println("RIGHT = " + matrix[i][j+1]);
        }
    }
}
