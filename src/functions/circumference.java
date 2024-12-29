package functions;

import java.util.Scanner;

public class circumference {
    public static double calculateCircumference(double r){
        double circumference = 2*3.14*r;
        return circumference;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        System.out.println("circumference is");
        System.out.println(calculateCircumference(r));
    }
}
