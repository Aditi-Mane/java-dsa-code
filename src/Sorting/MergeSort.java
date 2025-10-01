package Sorting;

import java.util.ArrayList;

//Best, Worst & Average TC: O(n log n) ; SC: O(n)
public class MergeSort {
    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        //loop to compare the elements of divided array
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        //loop to include the remaining elements from left/1st array
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        //loop to include the remaining elements from right/2nd array
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        //loop to insert the elements from temporary list into actual array
        for(int i=low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid); //to sort out first part of array
        mergeSort(arr, mid+1, high); //to sort out second part of array
        merge(arr, low, mid, high); //merge the parts
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        int n = arr.length;
        MergeSort.mergeSort(arr, 0, n-1);
        System.out.println("Merge sorted array is: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
