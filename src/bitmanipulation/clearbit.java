package bitmanipulation;

public class clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;
        System.out.println(bitMask);
        int bitMaskNot = ~(bitMask);
        System.out.println(bitMaskNot);
        int newNumber = bitMaskNot & n;
        System.out.println(newNumber);
    }
}
