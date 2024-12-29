package arraysProblem;

import java.util.Scanner;

public class arrangeEvenfirst {
    static void sortEvenAndOdd(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left<right){
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] % 2 != 0){
                right--;
            }
        }

    }//  yash jaat is the best player
    static void swap(int[] arr, int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void printArray(int arr[]){
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
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
        System.out.print("the sorted array is : ");
        sortEvenAndOdd(arr);
        printArray(arr);
    }
}
