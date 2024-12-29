package recurrsion;

public class frogJump {

    static int best(int[] h , int n ,int idx){// time complexibility = 2^n;
        if (idx == n-1) return 0;// base case

        int opt1 = Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1);
        if (idx == n-2)return opt1; // base case;
        int opt2 = Math.abs(h[idx] - h[idx + 2]) + best(h, n, idx + 2);

        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int [] h = {10, 30, 40, 20};
        System.out.println(best(h,h.length,0));
    }
}
