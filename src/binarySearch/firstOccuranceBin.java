package binarySearch;

public class firstOccuranceBin {
    static int findTarget(int arr[], int tar){
        int st = 0;
        int end = arr.length - 1;
        int firstS = -1;
        while (st <= end){
            int mid = st + (end - st)/ 2;
            if(arr[mid] == tar){
                firstS = mid;
                end = mid - 1;
//                st = mid + 1; for last occurance 
            } else if (tar < arr[mid]){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return firstS;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5,5,6,6,6};
        System.out.println(findTarget(arr, 5));
    }
}
