package conditionals;

import java.util.Scanner;

public class nestedlargestofthree { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a : ");
    int a = sc.nextInt();
    System.out.print("enter b : ");
    int b = sc.nextInt();
    System.out.print("enter c : ");
    int c = sc.nextInt();
    if (a>b){
        if (a>c){
            System.out.println("a is the largest");
        }
        else {
            System.out.println("c is the largest");
        }
    }
    else  {//b>a
        if (b>c){
            System.out.println("b is the largest");
        }
        else {
            System.out.println("c is the largest");
        }
    }
}
    }
