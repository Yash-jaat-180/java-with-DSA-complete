package recurrsion;

import java.util.Scanner;

public class palindromeString {
    static String printReverse2(String s, int idx){
        // base case
        if (idx == s.length()) return "";

        // recursive word
        String smallAns = printReverse2(s,idx +1);

        // self work
        char curr = s.charAt(idx);
        return smallAns + curr;
    }

    static boolean isPalindromeString(String s , int l , int r){// time complexibility is O(n);
        // base case
        if (l>=r) return true;
        return s.charAt(l) == s.charAt(r)  &&  isPalindromeString(s, l+1, r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = printReverse2(s,0);
        if (rev.equals(s)){
            System.out.println(s+" is palindrome string. ");
        }else
            System.out.println(s+" is not palindrome string. ");
        System.out.println(isPalindromeString(s,0,s.length()-1));
    }
}
