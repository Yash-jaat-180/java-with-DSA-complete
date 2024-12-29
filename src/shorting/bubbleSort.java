package shorting;

public class bubbleSort {
    static void sort(int[] a){
        int n = a.length;
        // n-1 itration
        for (int i= 0; i< n-1; i++){
            boolean flag = false;   // has any swaping happened
            for (int j= 0; j< n-i-1; j++){
                /*
                 last i element are already are at correct position
                 so no need to check them
                 */
                if (a[j] > a[j+1]){
                    // swaping;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }if (flag == false){
                return;
            }
        }
    }// yash jaat is the best athelete and a coder ;

    public static void main(String[] args) {
        int [] a= { 6, 4, 4, 8 };
        sort(a);
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}