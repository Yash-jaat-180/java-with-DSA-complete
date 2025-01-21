package queue;

public class implementationByCircularArray {
    public static class Cqueue{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int x) throws Exception{
            if (size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if (size == 0) {
                f = r = 0;
                arr[0] = x;
            }
            else if (r == arr.length - 1){
                r = 0;
                arr[r] = x;
            }
            else {
                arr[++r] = x;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else if(f == arr.length - 1){
                int x = arr[f];
                f = 0;
                size--;
                return x;
            }
            int x = arr[f++];
            size--;
            return x;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return;
            } else if (f <= r) {
                for(int i = f; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for(int i = f; i < arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Cqueue q = new Cqueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.remove());
        q.add(9);
        q.display();
    }
}
