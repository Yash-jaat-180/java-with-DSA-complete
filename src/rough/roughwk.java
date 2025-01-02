package rough;
import java.util.ArrayList;
import java.util.Collections.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class roughwk {
    static int findFirst(int[] a){
        int st = 0;
        int end = a.length - 1;
        int ans = -1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if((mid == a.length - 1 || a[mid] > a[mid + 1]) && (mid == 0 || a[mid] > a[mid - 1])){
                return mid;
            }
            else if(a[mid] < a[mid + 1]){
                st = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2};
        System.out.println(findFirst( arr));
    }
}