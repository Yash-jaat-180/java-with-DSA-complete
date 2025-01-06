package stack;


public class implimentationStackArray {
    public static class Stack{
        private int[] arr = new int[10];
        private int idx = 0;
        void push(int x){
            if (isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return x;
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            return idx == 0;
        }
        boolean isFull(){
            return arr.length == idx;
        }
        void display(){
            for(int i = 0; i < idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int capacity(){
            return arr.length;
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
