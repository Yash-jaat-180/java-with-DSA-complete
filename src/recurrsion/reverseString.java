package recurrsion;

import java.util.Scanner;

public class reverseString {
    static String printReverse2(String s, int idx){
        // base case
        if (idx == s.length()) return "";

        // recursive word
        String smallAns = printReverse2(s,idx +1);

        // self work
        char curr = s.charAt(idx);
        return smallAns + curr;
    }
    static String printReverse(String s ){
        // base case
        if (s.length() == 0) return "";

        // recursive work
        String smallAns = printReverse(s.substring(1));

        // self work
        char curr = s.charAt(0);
        return smallAns + curr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("the reverse of string is : ");
        System.out.println(printReverse(s));
        System.out.println(printReverse2(s, 0));
    }
}
