package conditionals;
import java.util.Scanner;
public class percentageelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of percentage : ");
        int p= sc.nextInt();
        if (p>90){
            System.out.println("excellent");


            }
        else if (p>80){
            System.out.println("very good");
        } else if (p>70) {
            System.out.println("good");

        }
        else {
            System.out.println("fail");
        }


    }
}
