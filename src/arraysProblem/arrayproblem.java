package arraysProblem;

import java.util.Scanner;

public class arrayproblem {
    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        swap(a,b);


    }
}
