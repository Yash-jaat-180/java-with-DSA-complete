package stack;

import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                String x = "" + ch;
                val.push(x);
            }
            else {
                String x2 = val.pop();
                String x1 = val.pop();
                String t =  "(" + x1 + ch + x2 + ")";
                val.push(t);
            }
        }
        System.out.println("ans : " + val.pop());
    }
}
