package linkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0; // we can update it on every insertion and we don't need size method which take o(n) time;0
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        void insertAtBegining(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        void insert(int index, int val){
            Node newNode = new Node(val);
            if (index == 0){
                insertAtBegining(val);
            }
            else {
                Node temp = head;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.next;
                    if(temp == null) throw new RuntimeException("Index out of bound");
                }
                if(temp.next == null) tail = newNode;
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        int getAt(int index){
            Node temp = head;
            if(index < 0 || index >= size()){
                System.out.println("wrong index");
                return -1;
            }
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        boolean delete(int val){
            Node temp = head;
            while (temp != null){
                if(temp.data == val){
                    head = temp.next;
                    return true;
                }  else if (temp.next.data == val) {
                    if(temp.next.next == null){
                        temp.next = null;
                        tail = temp;
                        return true;
                    }
                    else {
                        temp.next = temp.next.next;
                        return true;
                    }
                }
                temp = temp.next;
            }
            return false;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {

        linkedList ll = new linkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);

        ll.insert(0,55);
        ll.insert(5, 101);

        ll.delete(55);
        ll.delete(101);
        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);

        System.out.println("At index 3 is : "+ll.getAt(3));
        System.out.println("At index 4 is : "+ll.getAt(4));
    }
}
