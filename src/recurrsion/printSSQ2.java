package recurrsion;

public class printSSQ2 {
    static void printSsq(String s, String currAns){// s = abc

        // base case
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);//a
        String remString = s.substring(1);// remaning String = bc

        // current char -> chooses to be a part of currAns;
        printSsq(remString, currAns + curr);// bc -> remString, currAns -> "", a -> curr;

        // current char -> not choooses to be part of currAns;
        printSsq(remString, currAns);// bc, "";
    }
    public static void main(String[] args) {
        printSsq("abc", "");
    }
}
