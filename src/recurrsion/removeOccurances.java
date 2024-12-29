package recurrsion;

import java.util.Scanner;

public class removeOccurances {
    static String removeA2(String s){
        // base case ;
        if (s.length() == 0) return "";

        // recursive work
        String smallAns = removeA2(s.substring(1));

        char currChar = s.charAt(0);
        // self work
        if (currChar != 'a'){
            return currChar + smallAns;
        }else return smallAns;
    }

    static String removeA(String s, int idx ){ // time complexibility is O(n * n)because of currChar + smalllAns;
        // base case
        if (idx == s.length())return "";

        // recursive work
        String smallAns = removeA(s, idx+1);

        char currChar = s.charAt(idx);
        // self work
        if (currChar != 'a'){
            return currChar + smallAns;
        }else return smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
