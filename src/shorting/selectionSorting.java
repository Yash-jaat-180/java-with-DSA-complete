package shorting;

public class selectionSorting {
    static void sort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1 ; i++){
            // Find the minimum element in the unsort part of the aray;
            int minInd = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            // swap current element and minimum element
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,3, 4, 5 , 9};
        sort(arr);
        for (int i : arr){
            System.out.println(i+" ");
        }
    }
}
