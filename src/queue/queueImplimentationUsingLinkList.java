package queue;

public class queueImplimentationUsingLinkList {
    public static class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
        }
    }

    public static class queue{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int data){
            Node n = new Node(data);
            if(head == null) head = tail = n;
            else {
                tail.next = n;
                tail = n;
            }
            size++;
        }
        public int peek(){
            if (size == 0){
                System.out.println("Queue is empty.");
                return -1;
            }
            else return head.val;
        }
        public int remove(){
            if (size == 0){
                System.out.println("Queue is empty.");
                return -1;
            }
            else {
                int del = head.val;
                head = head.next;
                size--;
                return del;
            }
        }
        public void display(){
            if (size == 0){
                System.out.println("Queue is empty.");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display(); // 1 2 3 4 5
        q.remove();
        System.out.println(q.peek()); // 2
        q.display();// 2 3 4 5
        System.out.println(q.size); // 4
    }
}
