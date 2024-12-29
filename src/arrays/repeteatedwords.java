package arrays;

import java.util.Scanner;

public class repeteatedwords{
    static int findReapeted(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j= i+1;j<n;j++){
                if (arr[i] == arr[j]){
                   return arr[i];

                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("enter " + n + " element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("repeated words are : ");
        System.out.println(findReapeted(arr));

    }
}
