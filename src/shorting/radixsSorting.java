package shorting;

public class radixsSorting {
    static void displayArr(int [] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int maxInArray(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int []arr, int place){
        int n = arr.length;
        int [] output = new int[n];
        int max = maxInArray(arr);
        int [] count = new int[10];
        for (int i = 0 ; i< arr.length; i++){//   T.C -> n
            count[arr[i]/place % 10]++;
        }
        // Make prefix sum array of count array
        for (int i = 1; i< count.length; i++){  // t.c -> max
            count[i] += count[i-1];
        }
        // Find the index of each element in the origional array and put it in the output array
        for (int i = n-1; i >= 0 ; i--){// t.c -> n
            int idx = count[arr[i]/place % 10] - 1;
            output[idx] = arr[i];
            count[arr[i]/place % 10]--;
        }
        //  copy all element of output to arr;
        for (int i = 0 ; i< n ; i++){// t.c -> n;
            arr[i] = output[i];
        }
    }
    static void radixSort(int [] arr){
        int max = maxInArray(arr);
        // apply counting sort to sort elements based on place value;
        for (int place = 1; max/place >0; place *= 10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int [] arr = {43, 453, 727, 894, 0, 3};
        radixSort(arr);
        displayArr(arr);
    }
}
