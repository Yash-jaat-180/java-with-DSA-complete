package recurrsion;

import java.util.Scanner;

public class basic {
    static void printDecereasing(int n){
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.print(n+" ");
        // recursive work;
        printDecereasing(n-1);
    }
//    static void printIncreasing(int n ){
////        if (n == 1){// if we don't do this then stack will be overflow and this is called base case;
////            System.out.print(n+" ");
////            return;
////        }
//        printIncreasing(n-1);     // it print 1,2, ... n-1; this is called smaller subproblem;
//        System.out.print(n+" ");// this is called self work;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        printIncreasing(n);
        printDecereasing(n);
    }
}
