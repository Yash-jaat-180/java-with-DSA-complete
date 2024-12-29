package hashmap;
import java.util.*;
public class hashmapMethods {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
//        put is used for insertion and also updation
        mp.put("Akash", 18);
        mp.put("yash", 19);
        mp.put("love", 17);
        mp.put("Ishika", 25);

        System.out.println(mp.remove("Akash"));
        System.out.println(mp.get("Akash")); //    If does'nt exist return the null
        System.out.println(mp.containsKey("yash"));
        System.out.println(mp.putIfAbsent("Yashika", 30));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
//        In the below -> this is same as upper we don't need to give the type like two upper example
//                this is also the syntax for the for each loop
//        for(var e : mp.entrySet()){
//            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
//        }
    }
}
