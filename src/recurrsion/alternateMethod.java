package recurrsion;

public class alternateMethod {
    static int pow(int p, int q){
        // base case
        if (q == 0) return 1;

        // recursive work ;
        int smallAns = pow(p, q/2);
        if (q % 2 == 0){
            return smallAns * smallAns;
        }
        else {
            return p * smallAns * smallAns;
        }
 }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
