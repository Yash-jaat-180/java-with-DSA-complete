package functions;

import java.util.Scanner;

public class eligibleforvote {
    public static boolean eligibleforvote(int n){
        if (n>18){
            return true;
        }else {
            System.out.println("not eligible for vote");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(eligibleforvote(n));
    }
}
