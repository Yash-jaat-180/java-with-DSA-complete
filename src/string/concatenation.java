package string;

public class concatenation {
    public static void main(String[] args) {
//        String firstName = "tony";
//        String lastName = "stark";
//        String fullName = firstName+" "+ lastName;
//        System.out.println(fullName);

//          String firstName = "tony";
//        String lastName = "stark";
//        String fullName = firstName+" "+ lastName;
//        System.out.println(fullName.length());  // to find length
//
//        // charAt;
//
//        for (int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }

        //compare;
        String name1 = "tony";        //1 s1<s2 : +ve value;
        String name2 = "tony";       //2 s1==s2 : 0;
        if (name1.compareTo(name2) == 0){       //3 s1>s2 : -ve value;
            System.out.println("string are equal");

        }else {
            System.out.println("string are not equal");    // if we compare hello and cello h will win;
        }


    }
}
