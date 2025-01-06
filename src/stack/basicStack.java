package stack;

import java.util.ArrayList;
import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        ArrayList<Integer> arr1 = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(2);
        st.push(5);
        // peak
        System.out.println(st.peek());
//        can print the stack this way
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println("size is : "+st.size());
        while(st.size() > 1){
            st.pop();
        }
        System.out.println("1st element of stack : "+st.pop());
    }
}
