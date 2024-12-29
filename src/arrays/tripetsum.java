package arrays;

import java.util.Scanner;

public class tripetsum {
    static int tripletSum(int[] arr, int tar){

        int n = arr.length;
        int ans = 0;

        for (int i= 0 ;i<n;i++){// give first number ;
            for (int j= i+1;j<n;j++){// give second number ;
                for (int k = j+1 ;k<n;k++){// give third number ;
                    if (arr[i] + arr[j] + arr[k] == tar){
                        ans++;
                    }

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target : ");
        int tar = sc.nextInt();

        System.out.println(tripletSum(arr,tar));


    }
}
