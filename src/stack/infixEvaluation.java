package stack;

import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        String exp = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int x = ch - '0';
                val.push(x);
            }
            else {
                if(op.size() == 0 || ch == '(' || op.peek() == '('){
                    op.push(ch);
                }
                else {
                    if(ch == '+' || ch == '-'){
                        int x2 = val.pop();
                        int x1 = val.pop();
                        if (op.peek() == '-') val.push(x1 - x2);
                        else if (op.peek() == '+') val.push(x1 + x2);
                        else if (op.peek() == '*')  val.push(x1 * x2);
                        else if (op.peek() == '/')  val.push(x1 / x2);
                        op.pop();
                        op.push(ch);
                    } else if (ch == ')') {
                        while (op.peek() != '('){
                            int x2 = val.pop();
                            int x1 = val.pop();
                            if (op.peek() == '-') val.push(x1 - x2);
                            else if (op.peek() == '+') val.push(x1 + x2);
                            else if (op.peek() == '*')  val.push(x1 * x2);
                            else if (op.peek() == '/')  val.push(x1 / x2);
                            op.pop();
                        }
                        op.pop();

                    } else {
                        if(op.peek() == '+') op.push(ch);
                        else if (op.peek() == '-') op.push(ch);
                        else if (op.peek() == '*') {
                            int x2 = val.pop();
                            int x1 = val.pop();
                            val.push(x1 * x2);
                            op.pop();
                            op.push(ch);
                        }
                        else {
                            int x2 = val.pop();
                            int x1 = val.pop();
                            val.push(x1 / x2);
                            op.pop();
                            op.push(ch);
                        }
                    }
                }
            }
        }
        while (op.size() != 0){
            int x2 = val.pop();
            int x1 = val.pop();
            if (op.peek() == '-') val.push(x1 - x2);
            else if (op.peek() == '+') val.push(x1 + x2);
            else if (op.peek() == '*')  val.push(x1 * x2);
            else if (op.peek() == '/')  val.push(x1 / x2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
