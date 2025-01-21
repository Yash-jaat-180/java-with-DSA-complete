package backtracking;

public class ratInDeadMazeFourDirection {
    public static void printMaze(int sr, int sc, int er, int ec, String s, int[][] mat){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(mat[sr][sc] == -1 || mat[sr][sc] == 0) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        mat[sr][sc] = -1;
        // go down
        printMaze(sr + 1, sc, er, ec, s +"D", mat);
        // go right
        printMaze(sr, sc + 1, er, ec, s + "R", mat);
        // go up
        printMaze(sr - 1, sc, er, ec, s + "U", mat);
        // go left
        printMaze(sr, sc - 1, er, ec, s + "L", mat);

        // backtracking
        mat[sr][sc] = 1;
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
