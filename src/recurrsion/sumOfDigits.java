package recurrsion;

import java.util.Scanner;

public class sumOfDigits {
    static int SOD(int n){
        // base case

        if (n >=0 && n<= 9)return n;

        // recursive work -> small ans;
        int smallAns = SOD(n/10 );

        // self work;
        int ans = smallAns + n % 10;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SOD(n));
    }
}
