package stack;

import java.util.Stack;

public class nextGreaterElement {
    public static int[] findNextGreaterByLastElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[arr.length];
        res[n - 1] = -1;
        st.push(arr[n-1]);
        for(int i = n - 2; i >=0; i--){
            while (st.size() > 0 && arr[i] > st.peek()){
                st.pop();
            }
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static int[] findNextGreaterByFirstElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0] = -1;
        for(int i = 1; i < n; i++){
            res[i] = -1;
            while (st.size() > 0 && arr[i] > arr[st.peek()]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return res;
    }

    public static int[] findNextSmallerByFirstElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(0);
        res[0] = arr.length;
        for(int i= 1; i < arr.length; i++){
            res[i] = arr.length;
            while (st.size() > 0 && arr[i] < arr[st.peek()]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        return res;
    }

    public static int[] findPrevSmallerbyFirstElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr.length - 1);
        res[arr.length - 1] = -1;
        for(int i= arr.length - 2; i >= 0; i--){
            res[i] = -1;
            while (st.size() > 0 && arr[i] < arr[st.peek()]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1};
//        int[] ans = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            ans[i] = -1;
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[j] > arr[i]){
////                    ans[i] = arr[j];
////                    break;
////              }
//            }
//        }
//        for(int i = 0; i < ans.length; i++){
//            System.out.print(ans[i]+" ");
//        }

        int[] ans = findNextGreaterByLastElement(arr);
        int[] res = findNextGreaterByFirstElement(arr);
        int[] smallNext = findNextSmallerByFirstElement(arr);
        int[] smallPrev = findPrevSmallerbyFirstElement(arr);
//        for(int i= 0; i < ans.length; i++){
//            System.out.print(ans[i]+" ");
//        }
//        System.out.println();
//        for(int i = 0; i < res.length; i++){
//            System.out.print(res[i]+" ");
//        }
        for(int i = 0; i < smallNext.length; i++ ){
            System.out.print(smallNext[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < smallPrev.length; i++){
            System.out.print(smallPrev[i]+" ");
        }

    }
}
