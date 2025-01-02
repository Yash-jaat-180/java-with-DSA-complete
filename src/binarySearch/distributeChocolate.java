package binarySearch;

public class distributeChocolate {

    static boolean isDivisionPossible(int[] a, int m,int mxChoclateAllowed){
        int numOfStudents = 1;
        int choc = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > mxChoclateAllowed) return false;
            else if(choc + a[i] <= mxChoclateAllowed){
                choc += a[i];
            } else {
                numOfStudents++;
                choc = a[i];
            }
        }
        if(numOfStudents > m) return false;
        return true;
//        return numOfStudents <= m;
    }
    static int distributeChoco(int a[], int m){
        if(a.length < m) return -1;
        int ans = 0, st = 1, end = (int)1e9; // 10 raise to power nine

        while(st <= end){
            int mid = st + (end - st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {12,34,67,90};
        int m = 2;
        System.out.println(distributeChoco(a, m));
    }
}
