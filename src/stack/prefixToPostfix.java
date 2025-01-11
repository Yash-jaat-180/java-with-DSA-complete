package stack;

import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                String s = "" + ch;
                val.push(s);
            }
            else {
                String x1 = val.pop();
                String x2 = val.pop();
                String t = x1 + x2 + ch;
                val.push(t);
            }
        }
        System.out.println("ans : " + val.pop());
    }
}
