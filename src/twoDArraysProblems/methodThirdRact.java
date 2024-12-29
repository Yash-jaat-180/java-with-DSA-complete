package twoDArraysProblems;

import java.util.Scanner;

public class methodThirdRact {
    static void findPrefixSumMatrix(int[][] matrix){
        // it will calculate row-wise and colm-wise prefix sum;
        // matrix[i][j] = sumRactangle (0,0) (i,j);
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horezontally to calculate row-wise prefix sum;
        for (int i=0; i<r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // transverse vertically to calculate row-wise prefix sum;
        for (int j=0; j<c; j++){
            for (int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int findSum3(int [][] matrix, int l1,int r1 , int l2, int r2){
        int ans = 0;
        int sum=0, up =0, left =0, upleft=0 ;
        findPrefixSumMatrix(matrix);
        sum = matrix[l2][r2];
        if (l1>=1)
            up = matrix[l1-1][r2];
        if (r1>=1)
            left = matrix[l2][r1-1];
        if (l1>=1 && r1 >= 1)
            upleft = matrix[l1-1][r1-1];

        ans = sum - up - left + upleft;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        int totelem = r*c;
        System.out.println("Enter "+totelem+" element : ");
        for (int i = 0; i<r ; i++){
            for (int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter rectangle boundries l1, r1, l2, r2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Ractangle Sum "+ findSum3(matrix, l1, r1, l2, r2));
    }
}
