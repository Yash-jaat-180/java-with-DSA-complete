package shorting;

public class sortZeroes {
    static void moveZero(int [] arr){
        int n= arr.length;
        boolean flag = false;
        for (int i=0; i<n-1; i++){
            for (int j=0; j< n-i-1; j++){
                if (arr[j] == 0 && arr[j+1] != 0){
                    // swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0, 0 , 0 ,4,0};
        moveZero(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
