package recurrsion;

import java.util.Scanner;

public class alternateSum {
    static int printSum(int n){
        // base case
        if (n == 0) return 0;

        // recursive work
        if (n % 2 == 0){
            return printSum(n-1) - n;
        }else {
            return printSum(n-1) + n;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printSum(n));
    }
}
