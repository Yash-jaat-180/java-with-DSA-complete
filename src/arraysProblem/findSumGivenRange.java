package arraysProblem;

import java.util.Scanner;

public class findSumGivenRange {
    static int[] makePrefSumArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");//    
        int n = sc.nextInt();

        int arr[] = new int[n + 1];

        System.out.print("Enter " + n + " element : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prifSum = makePrefSumArr(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prifSum[r] - prifSum[l - 1];

            System.out.println("Sum : " + ans);

        }
    }
}