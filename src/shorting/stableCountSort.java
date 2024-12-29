package shorting;

public class stableCountSort {
    static int maxInArray(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void displayArr(int [] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void countSort(int []arr){
        int n = arr.length;
        int [] output = new int[n];
        int max = maxInArray(arr);
        int [] count = new int[max+1];
        for (int i = 0 ; i< arr.length; i++){//   T.C -> n
            count[arr[i]]++;
        }
        // Make prefix sum array of count array
        for (int i = 1; i< count.length; i++){  // t.c -> max
            count[i] += count[i-1];
        }
        // Find the index of each element in the origional array and put it in the output array
        for (int i = n-1; i >= 0 ; i--){// t.c -> n
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //  copy all element of output to arr;
        for (int i = 0 ; i< n ; i++){// t.c -> n;
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 2, 2, 5};
        countSort(arr);
        System.out.println("Sorted array is : ");
        displayArr(arr);
    }
}
