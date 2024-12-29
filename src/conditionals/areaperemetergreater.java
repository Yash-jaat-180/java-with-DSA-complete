package conditionals;
import java.util.Scanner;


public class areaperemetergreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length :");
        int l = sc.nextInt();
        System.out.println("enter breadth : ");
        int b = sc.nextInt();
        int area =l*b, peremeter =2*(l+b);
        if (area>peremeter){                                     //we can also write three if here
            System.out.println("area is bigger than its perimeter.");
        }
        else if (area<peremeter){
            System.out.println("area is not bigger than its peremeter.");
        }
        else {
            System.out.println("area is equal to its peremeter.");
        }

    }
}
