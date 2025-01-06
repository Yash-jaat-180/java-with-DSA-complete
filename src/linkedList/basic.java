package linkedList;

public class basic {
    static int length(Node head){
        int len = 0;
        while (head != null){
            len++;
            head = head.next;
        }
        return len;
    }
    public static void displayList(Node head){
        Node temp = head;
        if(temp == null){
            System.out.println();
            return;
        }

        System.out.print(temp.data+" ");
        displayList(temp.next);
    }
    public static class Node{
        int data; // value
        Node next; // address of the next node
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(1);
        // 5 -> 4 -> 3 -> 2 -> 1
        a.next = b;
        b.next = c;
        c.next = d;

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a; // Now temp points to a
//        for(int i = 0; i <5; i++){
//            System.out.println(temp.data);
//            temp = temp.next; // Now temp points to next address
//        }

//        because we don't know the size
//        Node temp = a;
//        while (temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

        displayList(a); // this is recursively

        System.out.println("The length of list is : "+length( a));
    }
}
