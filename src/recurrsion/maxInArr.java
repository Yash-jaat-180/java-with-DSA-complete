package recurrsion;

public class maxInArr {
    static int maxInArray(int[] arr, int index){
        // base case
        if (index == arr.length-1){
            return arr[index];
        }
        // index +1, end of the array -> max -> through recursion;
        int smallAns = maxInArray(arr, index+1);

        // self work;
        return Math.max(arr[index], smallAns);  // this means comparision max value
    }

    public static void main(String[] args) {
        int [] arr = {5, 6, 7, 8, 9};
        System.out.println(maxInArray(arr, 0));
    }
}
