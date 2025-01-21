package backtracking;

public class ratInDeadMaze {
    public static void printMaze(int sr, int sc, int er, int ec, String s, int[][] mat){
        // down
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if(mat[sr][sc] == 0) return;
//        down
        printMaze(sr + 1, sc, er, ec, s + "D", mat);
//        right
        printMaze(sr, sc + 1, er, ec, s + "R", mat);
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        int n = mat.length;
        int m = mat[0].length;
        printMaze(0, 0, n - 1, m - 1, "", mat);
    }
}
