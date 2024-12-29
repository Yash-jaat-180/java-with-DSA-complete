package bitmanipulation;

public class getabit {
    public static void main(String[] args) {
        int n = 5;     // 5 == 101;
        int pos = 2;
        int bitMask = 1<<pos;
        System.out.println(bitMask);
        // left shift by 2;

        if ((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else {
            System.out.println(bitMask & n);
            System.out.println("bit was one");
        }
    }
}
