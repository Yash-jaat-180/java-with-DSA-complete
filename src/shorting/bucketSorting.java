package shorting;

import java.util.ArrayList;
import java.util.Collections;
public class bucketSorting {
    static void bucketSort(float[] arr) {
        // buckets
        int n = arr.length;
        ArrayList<Float>[] bucket = new ArrayList[n];
        // Create empty buckets
        for (int i = 0 ; i< n ; i++){
            bucket[i] = new ArrayList<Float>();
        }
        // Add elements into our bucket;
        for (int i = 0 ; i<n ; i++){
            int bucketidx = (int) arr[i] * n;
            bucket[bucketidx].add(arr[i]);
        }
        // Sort each bucket individually;
        for (int i = 0 ; i< bucket.length; i++){
            Collections.sort(bucket[i]);
        }
        // Merge all buckets to get final sorted array
        int idx = 0;
        for (int i = 0 ; i < bucket.length; i++){
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0 ; j < currBucket.size(); j++){
                arr[idx++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        for (float i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
