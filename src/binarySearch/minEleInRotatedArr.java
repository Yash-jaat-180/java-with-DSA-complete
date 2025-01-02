package binarySearch;

public class minEleInRotatedArr {
    static int findMin(int[] arr){
        int ans = -1;
        int st = 0;
        int n = arr.length;
        int end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] > arr[n - 1]){
                st = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {8,9,1,2,3,4,5,6,7};
        System.out.println(findMin(arr));
    }
}
