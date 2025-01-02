package binarySearch;

public class findTarDuplicatEle {
    static int findTar(int[] arr,int tar){
        int st = 0;
        int end = arr.length - 1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == tar) return mid;
            else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
            }
            else if(arr[mid] <= arr[end]){ // means mid to end is sorted
                if(tar > arr[mid] && tar <= arr[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // means st to mid is sorted
                if(tar >= arr[st] && tar < arr[mid]){
                    end = mid - 1;
                } else st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,1};
        System.out.println(findTar(arr, 1 ));
    }
}