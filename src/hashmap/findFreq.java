package hashmap;
import java.util.*;
public class findFreq {

    public static void main(String[] args){
        int arr[] = {1,3,2,1,4,1, 4, 4, 4, 5, 4, 4, 5};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(var ele : arr){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele) + 1);
            } else {
                freq.put(ele, 1);
            }
        }
        for(var entity : freq.entrySet()){
            System.out.printf("%d : %d\n", entity.getKey(), entity.getValue());
        }
        int max = 0;
        int ansKey = 0;
        for(var key : freq.keySet()){
            if(freq.get(key) > max){
                max = freq.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey + " " + freq.get(ansKey));
    }
}
