package backtracking;

public class maxKnightsInBoard {
    static int maxKnights = -1;
    static int number = 4;
    public static void helper(char[][] board, int row, int col, int num){
        int n = board.length;
        if (row == n){
//            if(num == 5) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
            System.out.println();
//            }
            maxKnights = Math.max(maxKnights, num);
            return;
        }
        if (isSafe(board, row, col)){
            board[row][col] = 'k';
            if(col != n-1) helper(board, row, col + 1, num + 1);
            else helper(board, row + 1, 0, num + 1);
            board[row][col] = 'x';
        }
        if(col != n-1) helper(board, row, col + 1, num);
        else helper(board, row + 1, 0, num);

    }
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // Upper case
        if (row - 2 >= 0) {
            // upper left
            if (col - 1 >= 0 && board[row - 2][col - 1] == 'k') {
                return false;
            }
            // upper right
            if (col + 1 < n && board[row - 2][col + 1] == 'k') {
                return false;
            }
        }

        // Left case
        if (col - 2 >= 0) {
//            left upper
            if (row - 1 >= 0 && board[row - 1][col - 2] == 'k') {
                return false;
            }
//            left lower
            if (row + 1 < n && board[row + 1][col - 2] == 'k') {
                return false;
            }
        }

        // Down case
        if (row + 2 < n) {
//            down left
            if (col - 1 >= 0 && board[row + 2][col - 1] == 'k') {
                return false;
            }
//            down right
            if (col + 1 < n && board[row + 2][col + 1] == 'k') {
                return false;
            }
        }

        // Right case
        if (col + 2 < n) {
//            right upper
            if (row - 1 >= 0 && board[row - 1][col + 2] == 'k') {
                return false;
            }
//            right lower
            if (row + 1 < n && board[row + 1][col + 2] == 'k') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        helper(board, 0, 0, 0);
        System.out.println("max no. of knight possible : "+maxKnights);
    }
}
