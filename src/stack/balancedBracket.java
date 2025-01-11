package stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bracket = sc.next();
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        int count = 0;
        if (bracket.length() % 2 != 0){
            System.out.println("odd");
            flag = false;
        }
        for(int i = 0; i < bracket.length(); i++){
            char curChar = bracket.charAt(i);
            if(curChar == '('){
                st.push(curChar);
            }
            else {
                if(st.size() == 0){
                    flag = false;
                    count++;
                }
                else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty() && count > 0){
            flag = false;
            System.out.println("Bracked needed : "+count);
        }
        else {
            flag = false;
            System.out.println("else Bracket needed : "+st.size());
        }
        System.out.println(flag);
    }
}
