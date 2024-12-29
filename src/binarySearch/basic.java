package binarySearch;

public class basic {
    static int findTarget(int arr[], int tar){
        int st = 0;
        int end = arr.length - 1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if(tar == arr[mid]) return mid;
            else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        System.out.println(findTarget(arr, 24));
    }
}
