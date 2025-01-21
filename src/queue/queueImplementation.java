package queue;

public class queueImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val){
            if(r == arr.length - 1){
                System.out.println("Queue is full!");
                return;
            }
            else if(f == -1){
                f = r = 0;
                arr[f] = val;
                size++;
            }
            else {
                arr[++r] = val;
                size++;
            }
        }
        public int remove(){
            int x = arr[f];
            if(size == 0){
                System.out.println("Queue is already empty!");
                return -1;
            }
            f++;
            size--;
            return x;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is already empty!");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size == 0){
                System.out.println("q is empty");
            }
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
        System.out.println(q.size);
    }
}
