package Arrays;

import java.util.Arrays;

//TC: O(n); SC: O(1)
public class NextPermutation {
    static int[] findNext(int[] arr){

        //find breaking point index
        int breakIndex = -1, n = arr.length;
        for(int i = n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                breakIndex = i;
                break;
            }
        }
        //if there is no breakpoint found, reverse arr for next largest one
        if(breakIndex == -1){
            reverse(arr, 0, n-1);
            return arr;
        }
        //find index of smallest number greater than breakIndex and swap it
        for(int i = n-1; i >=0; i--){
            if(arr[i]>arr[breakIndex]){
                int temp = arr[i];
                arr[i] = arr[breakIndex];
                arr[breakIndex] = temp;
                break;
            }
        }
        //reverse numbers from breakIndex to end of array
        reverse(arr, breakIndex+1, n-1);
        return arr;
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        int[] ans = findNext(arr);
        System.out.println(Arrays.toString(ans));
    }
}
