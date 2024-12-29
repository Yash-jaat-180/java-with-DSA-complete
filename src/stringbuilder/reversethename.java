package stringbuilder;

public class reversethename {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1; // for h 5-1-0 = 4;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }
        System.out.println(sb);
    }
}