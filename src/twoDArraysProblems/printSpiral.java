package twoDArraysProblems;

import java.util.Scanner;

public class printSpiral {
    static void printSpiralOrder(int[][] matrix, int r , int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightcol = c-1;
        int totelement = 0;

        while (totelement< r * c){
            // top row -> leftcol to rightcol;
            for (int j=leftCol; j<=rightcol && totelement< r*c;j++) {
                System.out.print(matrix[topRow][j]+" ");
                totelement++;
            }
            topRow++;
            // rightcol -> toprow to bottomrow;
            for (int i=topRow; i<=bottomRow && totelement< r*c; i++){
                System.out.print(matrix[i][rightcol]+" ");
                totelement++;
            }
            rightcol--;
            // bottomrow -> rightcol to leftcol;
            for (int j=rightcol; j>=leftCol && totelement< r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totelement++;
            }
            bottomRow--;
            // leftcol -> botomrow to toprow;
            for (int i=bottomRow; i>=topRow  && totelement< r*c; i--){
                System.out.print(matrix[i][leftCol]+" ");
                totelement++;
            }
            leftCol++;
        }
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
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        int totel = r*c;
        System.out.println("Enter "+totel+" elements : ");
        for (int i=0; i<r ; i++){
            for (int j=0 ;j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix : ");
        printMatrix(matrix);
        System.out.println("Spiral Order : ");
        printSpiralOrder(matrix,r,c);

    }
}
