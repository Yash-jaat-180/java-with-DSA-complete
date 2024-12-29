package arraysProblem;

import java.util.Scanner;

public class twopointers {
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOne(int arr[]){
        int n = arr.length;
        int zeroes = 0;
        //count number of zeroes;
        for (int i = 0; i<n; i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }
        for (int i=0;i<n;i++){ // refill the array;
            if (i<zeroes){   //zeroes -1 index tak print 0;
                arr[i] = 0;

            }else {// then print 1;
                arr[i] = 1;
            }
        }

        // 0 to zeroes - 1 :0, zeroes to n-1 : 1;
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

        System.out.println("Enter "+n+" element : ");
        for (int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Origional array : ");
        printArray(arr);
        sortZeroesAndOne(arr);
        System.out.println("sorted array : ");
        printArray(arr);
    }
}
