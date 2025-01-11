package stack;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String exp = "9-(5+3)*4/6";
        System.out.println("Infix : "+ exp);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <= '9'){
                String s = "" + ch;
                val.push(s);
            }
            else {
                if(op.size() == 0 || ch == '(' || op.peek() == '('){
                    op.push(ch);
                }
                else {
                    if(ch == '+' || ch == '-'){
                        String x2 = val.pop();
                        String x1 = val.pop();
                        char o = op.pop();
                        String t = x1 + x2 + o;
                        val.push(t);
                        op.push(ch);
                    } else if (ch == ')') {
                        while (op.peek() != '('){
                            String x2 = val.pop();
                            String x1 = val.pop();
                            char o = op.pop();
                            String t = x1 + x2 + o;
                            val.push(t);
                        }
                        op.pop();

                    } else {
                        if(op.peek() == '+') op.push(ch);
                        else if (op.peek() == '-') op.push(ch);
                        else if (op.peek() == '*') {
                            String x2 = val.pop();
                            String x1 = val.pop();
                            char o = op.pop();
                            String t = x1 + x2 + o;
                            val.push(t);
                            op.push(ch);
                        }
                        else {
                            String x2 = val.pop();
                            String x1 = val.pop();
                            char o = op.pop();
                            String t = x1 + x2 + o;
                            val.push(t);
                            op.push(ch);
                        }
                    }
                }
            }
        }
        while (op.size() != 0){
            String x2 = val.pop();
            String x1 = val.pop();
            char o = op.pop();
            String t = x1 + x2 + o;
            val.push(t);
        }
        System.out.println("Postfix : "+val.pop());
    }
}
