package arrayList;
import java.util.ArrayList;
public class wrapperClass {
    public static void main(String[] args) {
        // wrapper class;
       Integer in = Integer.valueOf(4);
        System.out.println(in);

       Float f = Float.valueOf(4.6f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        // add new element ;
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i ;
        System.out.println(l1.get(1));

        // print with for loop;
        for (int i =0; i< l1.size(); i++){
            System.out.println(l1.get(i));
        }
        // printing the array list directly ;
        System.out.println(l1);

        // adding element at some index;   for eg : [5, 100, 6, 7, 8]
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at index i;
        l1.set(1 ,10);
        System.out.println(l1);

        //removing an element at index i;
        l1.remove(1);
        System.out.println(l1);

        //removing an element e;
        l1.remove(Integer.valueOf(8));
        System.out.println(l1.remove(Integer.valueOf(7))); // true is output;
        System.out.println(l1);

        // checking if an element exists;
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l;
        ArrayList l = new ArrayList();
        l.add("yash jaat");
        l.add(1);
        l.add(true);
        l.add(5.6);
        System.out.println(l);
     System.out.println(l.size());
    }
}
