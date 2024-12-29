package recurrsion;

public class subsetSum {
    static void subsets(int[] a, int n , int idx, int currSum){
        // base case
        if (idx >= n){
            System.out.println(currSum);
            return;
        }
        // curent idx + curr ans
        subsets(a,n,idx+1,currSum + a[idx]);

        // current idx
        subsets(a,n ,idx+1,currSum);
    }
    public static void main(String[] args) {
        int [] a = {2, 4, 5};
        subsets(a,a.length,0,0);
    }
}