package shorting;

public class insertionSorting {
    static void sort(int [] arr){
        int n = arr.length;
        for (int i= 1; i<n; i++){
            int j = i;
            while (j> 0 && arr[j] < arr[j-1] ){
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,5,3,0,1};
        sort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
