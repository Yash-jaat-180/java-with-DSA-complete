package conditionals;
import java.util.Scanner;

public class divisiblebymultipleno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        if (a%5==0 || a%3==0){
            System.out.println("it is divisible by 5 or3 .");
        }
        else {
            System.out.println("it is not divisible by 5 or 3 .");
        }
         // Note || means logical or
        //  and && means logical and
        //  and == means equal

    }
}
