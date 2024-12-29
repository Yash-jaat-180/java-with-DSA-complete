package stringbuilder;

import java.util.Scanner;

public class replaceletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        String result = "";

        for (int i= 0;i<sb.length();i++){
            if (sb.charAt(i) =='e' ){
                result += 'i';
            }else {
                result += sb.charAt(i);
            }
        }
        System.out.println(result);

    }
}
