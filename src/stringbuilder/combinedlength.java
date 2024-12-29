package stringbuilder;

import java.util.Scanner;

public class combinedlength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        StringBuilder[] name = new StringBuilder[size];
        int totlength = 0;

        for (int i=0;i<size;i++){
            name[i] = new StringBuilder(sc.nextLine());
            totlength += name[i].length();

        }
        System.out.println(totlength);


    }
}
