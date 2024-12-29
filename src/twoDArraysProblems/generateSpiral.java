package twoDArraysProblems;

import java.util.Scanner;

public class generateSpiral {
    static int [][] generateSpiralMatrix(int n){
        int [][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightcol = n-1;
        int current = 1;

        while (current<= n * n){
            // top row -> leftcol to rightcol;
            for (int j=leftCol; j<=rightcol && current<= n * n;j++) {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;
            // rightcol -> toprow to bottomrow;
            for (int i=topRow; i<=bottomRow &&  current<= n * n; i++){
                matrix[i][rightcol] = current;
                current++;
            }
            rightcol--;
            // bottomrow -> rightcol to leftcol;
            for (int j=rightcol; j>=leftCol && current<= n * n; j--){
               matrix[bottomRow][j] = current;
               current ++;
            }
            bottomRow--;
            // leftcol -> botomrow to toprow;
            for (int i=bottomRow; i>=topRow  && current<=  n * n; i--){
               matrix[i][leftCol] = current;
                current++;
            }
            leftCol++;
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0 ;i<matrix.length;i++){
            for (int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);





    }
}
