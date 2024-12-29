package binarySearch;

public class findSquareRoot {
    static int findSq(int x){
        int ans = 0;
        int st = 0;
        int end = 24;
        while (st <= end){
            int mid = st + (end - st) / 2;
            int value = mid * mid;
            if(value == x) return mid;
            else if (value > x) {
                end = mid - 1;
            }
            else {
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 84;
        System.out.println(findSq(x));
    }

}
