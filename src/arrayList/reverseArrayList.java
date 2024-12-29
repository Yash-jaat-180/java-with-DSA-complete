package arrayList;

import java.util.ArrayList;

import java.util.Collections;

public class reverseArrayList {
    static void reverseList(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Origional list "+ list);
        Collections.reverse(list);
//        reverseList(list);
        System.out.println("Reversed List "+ list);
        Collections.sort(list);
        System.out.println("Ascending order "+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending Order "+ list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("My");
        l1.add("name");
        l1.add("is");
        l1.add("yash");
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
    }
}
