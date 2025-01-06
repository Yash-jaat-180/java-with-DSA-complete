package stack;

import java.util.Stack;

public class insertAtBot {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        2 index => 10
        int index = 2;
        Stack<Integer> rt = new Stack<>();
        while (st.size() > index){
            rt.push(st.pop());
        }
        st.push(10);
        while (rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
