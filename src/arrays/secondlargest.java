package arrays;

import java.util.Scanner;

public class secondlargest {
    static int findMax(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    static int secondMax(int[] arr) {
        int max = findMax(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findMax(arr);
        return secondmax;
    }

            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter length : ");
                int n = sc.nextInt();

                int[] arr = new int[n];

                System.out.print("enter " + n + " element : ");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("the second maximum element is : ");
                System.out.println(secondMax(arr));

            }
        }



