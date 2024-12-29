package hashmap;

import java.util.HashSet;

public class largConseEle {
    static int findLen(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(Integer ele : set){
            if(!set.contains(ele - 1)){
                int inc = 1;
                int count = 1;
                while (set.contains(ele + inc)){
                    count++;
                    inc++;
                }
                    if(count > max){
                        max = count;
                    }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,9,9,8, 50, 51};
        System.out.println(findLen(nums));
    }
}
