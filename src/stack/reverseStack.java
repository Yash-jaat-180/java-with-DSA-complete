package stack;

import java.util.Stack;

public class reverseStack {
    public static void modifyStack(Stack<Integer> st, Stack<Integer> rt){
        while (st.size() > 0){
            rt.push(st.pop());
        }
    }
    public static void pushAtBottom(Stack<Integer> s, int ele){
        if(s.size() == 0){
            s.push(ele);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, ele);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        Stack<Integer> rt = new Stack<>();
//        modifyStack(st, rt);
//        Stack<Integer> at = new Stack<>();
//        modifyStack(rt, at);
//        modifyStack(at, st);
//        System.out.println(st);
        // First method is the upper one

        // 2nd method by recursion is lower one;
        reverseStack(st);
        System.out.println(st);
    }
}
