package advancedpattern;

import java.sql.PreparedStatement;

public class pascalstraingle {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(m+" ");


            }
            System.out.println();
        }

    }
}
