package arraysProblem;

import java.util.Scanner;

public class prefixsum {

    static int[] makePrifixSum(int arr[]){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];

        for (int i=1; i<n;i++){
            pref[i] = pref[i-1] + arr[i] ;
        }return pref;
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
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
        int[] pref = makePrifixSum(arr);      // you have make this array first ;
        System.out.println("The prifix sum array is : ");
        printArray(pref);

    }
}
