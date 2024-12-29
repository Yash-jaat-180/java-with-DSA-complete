package recurrsion;

public class keypadCombination {
    static void combination(String dig, String [] kp, String res){// "253" -> kp[2]
        if (dig.length() == 0){// time complexibility is 4^n * n(substring method);
            System.out.print(res +" ");
            return;
        }

        int currNum = dig.charAt(0) - '0';// 2-0 SUBTRACT ASCII VALUE WE GOT 2. This is how we convert string into Integer
        String currChoices = kp[currNum];// "abc";

        for (int i=0; i<currChoices.length(); i++){
            combination(dig.substring(1),kp,res + currChoices.charAt(i) );
        }
    }
    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //              0, 1,   2,     3,      4,   ...;
        combination(dig, kp, "");

    }
}
