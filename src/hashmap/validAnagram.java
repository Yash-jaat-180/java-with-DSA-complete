package hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class validAnagram {
//    -> Here is 2nd approch in which we are less the space complexity
    
//    static boolean checkAnagram(Map<Character, Integer> map1, String str1, String str2){
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        for(int i = 0; i < str1.length(); i++){
//            if(map1.containsKey(str1.charAt(i))){
//                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
//            } else map1.put(str1.charAt(i), 1);
//        }
//        for(int i = 0; i < str2.length(); i++){
//            char ch = str2.charAt(i);
//            if(map1.containsKey(ch)){
//                map1.put(ch, map1.get(ch) - 1);
//            } else return false;
//        }
//        for (int value : map1.values()){
//            if(value != 0) return false;
//        }
//        return true;
//    }  //
    static boolean checkAnagram(Map<Character, Integer> map1, Map<Character, Integer> map2, String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0; i < str1.length(); i++){
            if(map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            } else map1.put(str1.charAt(i), 1);
        }
        for(int i = 0; i < str2.length(); i++) {
            if (map2.containsKey(str2.charAt(i))) {
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
            } else map2.put(str2.charAt(i), 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        boolean flag = checkAnagram(map1, map2, str1, str2);
        System.out.println(flag);
    }
}
