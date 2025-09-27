package Recursion;

import java.util.Arrays;

public class ReverseArray {
    //using two pointers
    static void reverse(int[] arr, int start, int end){
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }
    //using a single pointer
    static void reverse2(int[] arr, int i){
        if(i>arr.length/2) return;

        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;

        reverse2(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //reverse(arr, 0, arr.length - 1);
        reverse2(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
