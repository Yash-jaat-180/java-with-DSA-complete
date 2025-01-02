package binarySearch;

public class findInTwoDArray {
    static boolean findTar(int matrix[][], int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int st = 0;
        int end = n * m - 1;
        while (st <= end){
            int mid = st + (end - st)/2;
            int ele = matrix[mid/m][mid % m];
            if(ele == target) return true;
            else if(target > ele) st = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7}, {10,11,16,17}, {23,30,34,60}};

        System.out.println(findTar(matrix, 1));
    }

}
