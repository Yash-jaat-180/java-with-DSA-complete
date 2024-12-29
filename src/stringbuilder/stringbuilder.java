package stringbuilder;

public class stringbuilder {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("tony");
//        System.out.println(sb);
//
//        //char at index 0
//        System.out.println(sb.charAt(0));
//
//        //set char at index
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        //insert ;
//        sb.insert(3,'n');
//        System.out.println(sb);
//
//        // delete the extra n
//        sb.delete(2,4);
//        System.out.println(sb);


        // append : means start from last;
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
