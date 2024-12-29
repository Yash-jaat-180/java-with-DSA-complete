package twoDArraysProblems;

import java.util.Scanner;

public class transpose {
    static void transposeInPlace(int [][] matrix, int r, int c){ // this is only for square matrix
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                // swaping matrix [i][j], matrix[j][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
//    static int[][] findTranspose(int [][] matrix, int r, int c){
//        int[][] ans = new int[c][r];
//
//        for (int i=0;i<c;i++){
//            for (int j=0;j<r;j++){
//                ans[i][j] = matrix[j][i];
//            }
//        }return ans;
//    }
    static void printMatrix(int[][] matrix, int r, int c){
        for (int i = 0 ;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(matrix[i][j]+ " ");
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
        int[][] matrix = new int[r][c];
        int totElements = r*c;
        System.out.println("Enter "+totElements+" elements : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix : ");
        printMatrix(matrix,r,c);

        System.out.println("Transpose of matrix : ");
//        int[][] ans = findTranspose(matrix,r,c);
//        printMatrix(ans);
        transposeInPlace(matrix,r,c);
        printMatrix(matrix,r,c);
    }
}
