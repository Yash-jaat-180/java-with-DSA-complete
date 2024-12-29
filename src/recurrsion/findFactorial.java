package recurrsion;

import java.util.Scanner;

public class findFactorial {
    static int calculateFactorial(int n){
        // base case
        if (n == 0){
            return 1;
        }
        // recursive work;
        int smallAns = calculateFactorial(n-1);
        // self work
        int ans = n * smallAns;  // n * n-1;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateFactorial(n));
    }
}
