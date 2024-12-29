package stringbuilder;

import java.util.Scanner;

public class printusername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter email id : ");
        StringBuilder sb = new StringBuilder(sc.next());

        String username = "";

        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i) == '@'){
                break;
            }else {
                username += sb.charAt(i);
            }
        }
        System.out.print("your username is : ");
        System.out.println(username);
    }
}
