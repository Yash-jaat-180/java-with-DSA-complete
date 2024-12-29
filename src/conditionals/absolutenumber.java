package conditionals;
import java.util.Scanner;
public class absolutenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any integer : ");
        int a = sc.nextInt();
        System.out.print("the absolute value is : ");
        if (a<0){
            System.out.println(a*-1);

        }



    }
}
