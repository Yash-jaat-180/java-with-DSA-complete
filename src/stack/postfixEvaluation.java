package stack;

import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int x = ch - '0';
                val.push(x);
            }
            else {
                int x2 = val.pop();
                int x1 = val.pop();
                if(ch == '+') val.push(x1 + x2);
                else if (ch == '-') val.push(x1 - x2);
                else if (ch == '*') val.push(x1 * x2);
                else val.push(x1 / x2);
            }
        }
        System.out.println("ans : " + val.pop());
    }
}
