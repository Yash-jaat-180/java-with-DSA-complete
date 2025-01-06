package stack;

public class implimentationStackLinked {
    public static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
        }
    }
    public static class Stack{
        Node head = null;
        private int size = 0;
        void push(int val){
            Node x = new Node(val);
            x.next = head;
            head = x;
            size++;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        private void printList(Node h){
            if(h == null) return;
            printList(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            printList(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            return head == null;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();
    }
}
