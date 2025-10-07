package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverse;

public class LeftRotateArray {

    //method 1:
    //optimal solution: TC - 0(n); SC - O(n) array space & O(1) extra space
    static int[] byOne(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
                arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }

    //method 2:
    //brute force solution: TC - O(n+d); SC: O(d)
    static int[] bykPlaces(int[] arr, int k){
        //if k > length of array, eg: 20 = 6+6+6+(2) -> 20%6=2 -> remainder
        k = k % arr.length;
        //putting the starting elements on basis of d in temporary array
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(arr[i]);
        }
        //shifting elements from k onwards
        for(int i=k;i<arr.length;i++){
            arr[i-k] = arr[i];
        }
        //filling in the temporary list elements at end
        for(int i=0;i<k;i++){
            arr[arr.length - k + i] = list.get(i);
        }
        return arr;
    }

    //optimal solution: TC - (2n); SC - O(1) extra space
    static int[] bykPlacesOptimal(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    static void reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k = 20;
        //int[] newArr = bykPlaces(arr, k);
        int[] newArr2 = bykPlacesOptimal(arr, k);
        //System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr2));
    }
}
