package shorting;

public class sortTwoElement {
    static void displayArray(int [] num){
        int n = num.length;
        for (int i : num){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void sortArray(int [] num) {
        int n = num.length;
        int x = -1, y = -1;

        if (n <=1) {// corner case , edge case
            return;
        }

        // process all adjecent elements
        for (int i = 1; i < n; i++) {
            if (num[i - 1] > num[i]) {
                if (x == -1) {// first conflict
                    x = i - 1;
                    y = i;
                } else {// 2nd conflict
                    y = i;
                }
            }
        }
        // swaping
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {10, 5, 6, 7, 8, 9, 3};
        sortArray(num);
        displayArray(num);
    }
}
