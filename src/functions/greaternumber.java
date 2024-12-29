package functions;

import java.util.Scanner;

public class greaternumber {
    public static int printGreaterNo(int a, int b){
        if (a>b){
            System.out.println("a is greater");
            return a;
        } else if (a==b) {
            System.out.println("a is equal to b");
            return a;

        } else {
            System.out.println("b is greater");
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printGreaterNo(a,b));

    }
}
