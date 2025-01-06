package stack;

import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        System.out.println("Enter No. of elements you want to put in the stack : ");
//        n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            int ele = sc.nextInt();
//            st.push(ele);
//        }
//        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> newSt = new Stack<>();
        while (st.size() > 0){
            newSt.push(st.pop());
        }
        System.out.println(newSt);

        Stack<Integer> copySt = new Stack<>();
        while (newSt.size() > 0){
            copySt.push(newSt.pop());
        }
        System.out.println(copySt);
    }
}
