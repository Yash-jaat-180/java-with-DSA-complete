package recurrsion;

import java.util.Scanner;

public class fibnacci {
    static int fib(int n){
        // base case
        if (n == 0 || n == 1)return n;

        // sub problem - recursive work
        int prev = fib(n-1);
        int prevPrev = fib(n-2);
        return prev +prevPrev;
//        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        loop for printing the fibonacci series
    }
}
