package conditionals;

import java.util.Scanner;

public class nestedifelse {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a : ");
    int a = sc.nextInt();
    if (a%5==0 || a%3==0){
        if (a%15!=0){
            System.out.println("number is divisible by 3 or 5 but not to 15");
        }
        else {
            System.out.println("not in programm" );
        }
    }

}
    }
