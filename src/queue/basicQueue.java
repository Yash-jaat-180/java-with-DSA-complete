package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class basicQueue {
    public static void printQueue(Queue<Integer> q){
        System.out.println("printing all elements : ");
        while (q.size() != 0){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    public static void printQueueUsingExtraQueue(Queue<Integer> q){
        System.out.println("printing all elements : ");
        Queue<Integer> q1 = new LinkedList<>();
        while (q.size() != 0){
            q1.add(q.peek());
            System.out.print(q.remove()+" ");
        }
        while (q1.size() > 0){
            q.add(q1.poll());
        }
        System.out.println();
        System.out.println("extra queue : "+q1);
        System.out.println("given queue : "+q);
    }
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q1 = new LinkedList<>();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1.size());
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        System.out.println(q1.peek()); // q1.peek() also work the same.

        //print all the elements
//        printQueue(q1);
        // printing all the element using extra queue ;
        printQueueUsingExtraQueue(q1);
    }
}
