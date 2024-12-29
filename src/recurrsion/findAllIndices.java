package recurrsion;

import java.util.ArrayList;

public class findAllIndices {

    static ArrayList<Integer> allIndices(int[] arr, int tar, int idx){
        // base case
        if (idx == arr.length) return new ArrayList<>();  // this is empty array list;

        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if (arr[idx] == tar){
            ans.add(idx);
        }

        // recursive work
        ArrayList<Integer> smallAns = allIndices(arr, tar, idx+1);

        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 4, 5, 4};
        int tar = 4;

        ArrayList<Integer> ans = allIndices(arr, tar, 0);
        for (Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
