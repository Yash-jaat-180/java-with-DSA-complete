package recurrsion;

import java.util.Scanner;

public class pRaisePowerQ {
    static int f(int p, int q){
        // base case
        if (q == 0)return 1;
        // recursive work;
        int smallAns = f(p, q-1);
        // self work ;
        return smallAns * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(f(p,q));
    }
}
