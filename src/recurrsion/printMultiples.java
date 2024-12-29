package recurrsion;

import java.util.Scanner;

public class printMultiples {
    static void printTable(int n, int k) {
        // base case
        if (k == 0) {
            return;
        }

        // recursive work;
        printTable(n, k-1);

        // self work
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printTable(n, k);

    }
}
