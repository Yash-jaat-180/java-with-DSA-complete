package conditionals;
import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        System.out.print("enter c : ");
        int c = sc.nextInt();
        if (a>b&&a>c){
            System.out.println("a is greater integer");

        } else if (b>a&&b>c) {
            System.out.println("b is the greatest integer");


        }
        else {
            System.out.println("c is the greatest integer");
        }
    }
}
