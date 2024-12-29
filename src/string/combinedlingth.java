package string;

import java.util.Scanner;

public class combinedlingth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] names = new String[size];

        int totlength = 0;

        for (int i=0;i<size;i++){
            names[i] = sc.nextLine();
            totlength += names[i].length();

        }
        System.out.print(totlength);
    }
}
