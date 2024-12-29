package conditionals;
import java.util.Scanner;
public class threedigitnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        if (a<1000&a>99){         // & means and;
            System.out.println("it is a three diget number.");
        }
        else {
            System.out.println("it is not6 a three diget number.");
        }

    }
}
