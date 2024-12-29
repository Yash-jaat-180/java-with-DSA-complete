package recurrsion;

import java.util.ArrayList;

public class returnSSQ {
    static ArrayList<String> getSSQ(String s){// space is 2^n; which is more;
        ArrayList<String> ans = new ArrayList<>();

        // base case;
        if (s.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0); // a
        // smallAns
        ArrayList<String> smallAns = getSSQ(s.substring(1));// bc

        // self work
        for (String ss : smallAns){
            ans.add(ss);// bc
            ans.add(curr + ss);// abc
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for (String ss : ans){
            System.out.println(ss);
        }
    }
}
