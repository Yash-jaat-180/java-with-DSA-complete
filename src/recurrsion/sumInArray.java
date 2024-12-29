package recurrsion;

public class sumInArray {
    static int printSum(int[] arr, int idx){
        // base case
        if (idx == arr.length-1)return arr[idx];

        // recursive work
        int smallAns = printSum(arr, idx+1);

        // self work
        return arr[idx] + smallAns;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2 , 0 , 4, 5};
        System.out.println(printSum(arr,0));
    }
}
