package shorting;

public class countSort {
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
    static void basicCountSort(int [] arr){ // 2,4,2,2;
        // find the largest element of the array
        int max = maxInArray(arr);
        int [] count = new int[max + 1];
        for (int i = 0 ; i < arr.length; i++){
            /*
            0 0 3 0 1   freq arr;
            0 1 2 3 4   arr size;
             */
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0 ; i< count.length; i++){// 0 0 3 0 1
            for (int j = 0 ; j < count[i]; j++){
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 2, 2, 5};
        basicCountSort(arr);
        System.out.println("Sorted array is : ");
        displayArr(arr);
    }
}
