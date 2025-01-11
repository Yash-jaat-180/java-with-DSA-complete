package stack;

import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int x = ch - '0';
                val.push(x);
            }
            else {
                int x1 = val.pop();
                int x2 = val.pop();
                if(ch == '+') val.push(x1 + x2);
                else if (ch == '-') val.push(x1 - x2);
                else if (ch == '*') val.push(x1 * x2);
                else val.push(x1 / x2);
            }
        }
        System.out.println("ans : " + val.pop());
    }
}
