package functions;

import javax.swing.*;
import java.util.Scanner;

public class factorialofnumber {
    public static void calculateFactorial(int n){
        if (n<0){
            System.out.println("invalid number");
        }
        int factorial=1;
        for (int i=n;i>=1;i--){
            factorial = factorial*i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);


    }
}

