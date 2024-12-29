package string;

import java.util.Scanner;

public class printusername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gmail = sc.next();
        String username = "";

        for (int i=0;i<gmail.length();i++){
            if (gmail.charAt(i) == '@'){
                break;
            }else {
                username += gmail.charAt(i);
            }
        }
        System.out.println(username);
        // int i

    }
}
