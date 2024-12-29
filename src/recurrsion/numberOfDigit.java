package recurrsion;

import java.util.Scanner;

public class numberOfDigit {
    static int nod(int n){
        // base case


        if (n >=0 && n<= 9)return 1;

        // recursive work -> small ans;
        int smallAns = nod(n/10 );

        // self work;
        int ans = smallAns + 1;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nod(n));
    }
}
