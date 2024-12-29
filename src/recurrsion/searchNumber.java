package recurrsion;

import java.util.Scanner;

public class searchNumber {

    static void findAllIdexes(int[] arr, int tar, int idx){
        // base case
        if (idx == arr.length) return;

        // self work
        if (arr[idx] == tar){
            System.out.print(idx+" ");
        }
        // recursive work
        findAllIdexes(arr, tar, idx+1);
    }


    static boolean searchNo(int[] arr, int tar , int idx) {
        // base case
        if (idx == arr.length) return false;

        // self work
        if (arr[idx] == tar) return true;

        // recursive work also can be
        return searchNo(arr, tar, idx+1);
//        // recursive work
//        if (searchNo(arr, tar, idx + 1)) {
//            return true;
//        }else return false;
    }


    static int findIndex(int[] arr, int tar , int idx) {
        // return index of target if target present in array, otherwise -1;
        // base case
        if (idx == arr.length) return -1;

        // self work
        if (arr[idx] == tar) return idx;

        // recursive work also can be
        return findIndex(arr, tar, idx+1);
//        // recursive work
//        if (searchNo(arr, tar, idx + 1)) {
//            return true;
//        }else return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2 , 4 , 4 , 5};
        int tar = sc.nextInt();
// 1st method       if (searchNo(arr, tar, 0)){// it is equal searchNo(arr, tar, 0) == true ;same baat hai
//            System.out.println("Yes");
//        }else {// if false then print No;
//            System.out.println("No");
//        }

// 2nd method       System.out.println(findIndex(arr, tar,0));

        findAllIdexes(arr,tar, 0);


    }
}

