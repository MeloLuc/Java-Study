package matrix.aplication;

import java.util.Scanner;

public class matrix {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.printf("Enter the numbers of the matrix %d X %d%n", n, n);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("-Main Diagonal-");
        for(int i=0; i<matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("-Number of Negative Numbers: " + count);

        sc.close();
    }
}
