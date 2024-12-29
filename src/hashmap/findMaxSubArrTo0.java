package hashmap;

import java.util.HashMap;

public class findMaxSubArrTo0 {
    static int findSubArr(int[] arr){
        int pref = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < arr.length; i++){
            pref += arr[i];
            if(!map.containsKey(pref)){
                map.put(pref, i);
            } else {
                maxLen = Math.max(maxLen,i - map.get(pref));
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, -25};
        int len = findSubArr(arr);
        System.out.println(len);
    }
}
