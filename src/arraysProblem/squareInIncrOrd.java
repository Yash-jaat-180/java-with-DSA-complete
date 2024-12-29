package arraysProblem;

import java.util.Scanner;

public class squareInIncrOrd {

    // In this array we have to take input a large no. at 1st pos or last pos.;

    static int[] sortSquares(int [] arr){
        int n= arr.length;
        int left = 0, right = n-1;
        int ans[] = new int[n];
        int k = 0;
        while (left<right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;

    }
    static void reverse(int [] arr){
        int i =0 , j = arr.length-1;
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Origional array : ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        reverse(ans);
        System.out.print("Sorted array : ");
        printArray(ans);
    }
}
