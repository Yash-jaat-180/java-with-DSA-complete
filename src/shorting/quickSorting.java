package shorting;
public class quickSorting {
    static void displayArr(int[] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void swaping(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[]arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1; i<= end; i++){
            if (arr[i] <= pivot)
                count++;
        }
        int pvtIdx = st + count;
        swaping(arr,st,pvtIdx);

        int i = st, j= end;
        // elements lesser left of pivatIdx , greater  -> right side of pivatIdx
        while (i < pvtIdx && j > pvtIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pvtIdx && j > pvtIdx) {
                swaping(arr, i, j);
                i++;
                j--;
            }
        }
        return pvtIdx;
    }

    static void quickSort(int []arr, int st, int end){
        if (st >= end) return;

        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Array before sorting ");
        displayArr(arr);
        quickSort(arr,0, arr.length-1);

        System.out.println("Array after sorting ");
        displayArr(arr);
    }
}
