package hashmap;

import java.util.HashSet;

public class hashsetMethods {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");
        st.add("Scoot");
        st.add("James");
        System.out.println(st);
        System.out.println(st.contains("James"));
//        size, remove,
        for(String s : st){
            System.out.println(s);
        }
    }
}
