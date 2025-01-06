package stack;

import java.util.Stack;

public class displayStack {
    public static void displayRev(Stack<Integer> s){
        if(s.size() == 0){
            System.out.println();
            return;
        }
        int top = s.pop();
        System.out.print(top+" ");
        displayRev(s);
        s.push(top);
    }
    public static void displayRec(Stack<Integer> s){
        if(s.size() == 0){
            return;
        }
        int top = s.pop();
        displayRec(s);
        System.out.print(top+" ");
        s.push(top);
    }
    public static void pushAtBottom(Stack<Integer> s, int ele){
        if(s.size() == 0){
            s.push(ele);
            System.out.println();
            return;
        }
        int top = s.pop();
        pushAtBottom(s, ele);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        int[] arr = new int[st.size()];
//        for(int i = arr.length - 1; i >= 0; i--){
//            arr[i] = st.pop();
//        }
//        for(int i = 0; i < arr.length; i++){
//            st.push(arr[i]);
//            System.out.print(st.peek()+" ");
//        }
//        System.out.println();
//

//        by recursion
        displayRev(st);
        System.out.println(st);
        displayRec(st);
        pushAtBottom(st,10);
        System.out.println(st);
    }
}
