package conditionals;


import java.util.Scanner;

public class sideoftraingle { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a : ");   // a,b,c be the side of traingle
    int a = sc.nextInt();
    System.out.print("enter b : ");
    int b = sc.nextInt();
    System.out.print("enter c : ");   // if sum of two sides of traingle is > the third side then it is a traingle
    int c = sc.nextInt();
    if (a + b > c && b + c > a && a + c > b) {
        System.out.println("it is a traingle");
    }


}
    }