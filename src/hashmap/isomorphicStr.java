package hashmap;

import java.util.HashMap;

public class isomorphicStr {

    static boolean checkIsomorphic(String s, String t){
        HashMap<Character, Character> hmap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){

            char currCharS = s.charAt(i);
            char currCharT = t.charAt(i);
            if(!(hmap.containsKey(currCharS))){
                if(hmap.containsValue(currCharT)) return false;
                hmap.put(currCharS, currCharT);
            } else {
                if(hmap.get(currCharS) == currCharT){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aabcbc";
        String t = "xxymyw";
        boolean flag = checkIsomorphic(s, t);
        if(flag){
            System.out.println("Isomorphic");
        } else {
            System.out.println("not Isomorphic");
        }
    }
}
