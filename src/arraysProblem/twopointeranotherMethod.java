package arraysProblem;

import java.util.Scanner;

public class twopointeranotherMethod {
    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0 ,right = n-1;

        while (left<right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if (arr[left] == 0){
                left++;
            }if (arr[right] == 1){
                right--;
            }
        }printArray(arr);
    }
    static void printArray(int arr[]){
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter "+n+" element : ");
        for (int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Origional array : ");
        printArray(arr);
        System.out.print("Shorted array is : ");
        sortZeroesAndOnes(arr);
    }
}
