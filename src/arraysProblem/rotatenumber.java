package arraysProblem;

import java.util.Scanner;

public class rotatenumber {


    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100004];

        for (int i=0;i<arr.length; i++){
            freq[arr[i]]++;     // i= 0 and arr[0] = 5, then freq[5]= 1 add ho jayega;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("enter "+n+" element : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int freq[] = makeFrequencyArray(arr);
        System.out.print("enter number of queries : ");
        int q = sc.nextInt();

        while (q>0){
            System.out.print("enter number to be searched : ");
            int x = sc.nextInt();
            if (freq[x] >0){
                System.out.print("Yes");
            }else {
                System.out.print("No");
            }
            q--;
        }
    }
}
