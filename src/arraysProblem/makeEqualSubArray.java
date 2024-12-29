package arraysProblem;

import java.util.Scanner;

public class makeEqualSubArray {
    static int findArraySum(int [] arr){
        int totSum = 0;
        for (int i = 0 ;i<arr.length;i++){
            totSum += arr[i];    // it means = totSum = totSum + arr[i];
        }
        return totSum;
    }
    static boolean equalSumPartition(int [] arr){
        int totSum = findArraySum(arr);
        int prefSum = 0;

        for (int i = 0 ; i<arr.length;i++){
            prefSum += arr[i];
            int suffSum = totSum - prefSum;
            if (suffSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible : "+ equalSumPartition(arr));
    }
}
