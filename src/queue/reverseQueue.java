package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        q.add(101);
        q.add(54);
        q.add(4);
        q.add(5);
        Stack<Integer> st = new Stack<>();
        int k = 4;
        int count = 0;
        while (count != k){
            st.push(q.remove());
            count++;
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
        int i = q.size() - k;
        while (i > 0){
            q.add(q.remove());
            i--;
        }
        System.out.println(q);
    }
}
