package conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of cp  : ");
        int cp = sc.nextInt();
        System.out.print("enter value of sp : ");
        int sp = sc.nextInt();
        if (sp>cp){
            System.out.print("he made profit of : ");
            System.out.println(sp-cp);
        }
        else{
            System.out.print("he incurred loss of : ");
            System.out.println(cp-sp);
        }
    }
}
