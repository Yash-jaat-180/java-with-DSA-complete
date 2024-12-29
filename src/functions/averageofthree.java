package functions;

import java.util.Scanner;

public class averageofthree {
    public static double calculateaverage(double a, double b, double c){
        double average = (a+b+c)/3;
        System.out.print(average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        calculateaverage(a,b,c);

    }
}