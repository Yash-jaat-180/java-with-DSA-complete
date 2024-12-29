package bitmanipulation;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n= 5;
        int pos = 1;
        int bitMask = 2<<pos;
        System.out.println(bitMask);
        if (oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        }

    }
}
