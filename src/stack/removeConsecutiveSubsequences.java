package stack;

import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i] || arr[i] != arr[i-1]) st.push(arr[i]);
             else {
                if(i == arr.length - 1 || arr[i] != arr[i + 1]) st.pop();
            }
        }
        int[] newArr = new int[st.size()];
        int n = newArr.length - 1;
        for(int i = n; i >= 0; i--){
            newArr[i] = st.pop();
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,10,10,10,4,4,5,7,7,2};
        int[] resultant = remove(arr);
        for(int i = 0; i < resultant.length; i++){
            System.out.print(resultant[i]+" ");
        }
    }
}
