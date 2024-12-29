package functions;
import com.sun.source.doctree.SummaryTree;
import java.util.Scanner;
public class sumoftwonumbers {
    public static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
            

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum= printSum(a, b);
        System.out.print("the sum of two numbers : ");
        System.out.println(sum);


        

    }
}
