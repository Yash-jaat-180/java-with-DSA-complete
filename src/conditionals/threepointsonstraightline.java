package conditionals;
import java.util.Scanner;
public class threepointsonstraightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = 1;
        double b1 = 1;
        double a2 = 2;
        double b2 = 2;
        double a3 = 3;
        double b3 = 3;
        double p = (b2-b1)/(a2-a1);
        double q = (b3-b2)/(a3-a2);
        if (p==q){
        System.out.println("all three points lie on a straight line");
        }
        else {
            System.out.println("not lie on straight line");
        }
}
    }
