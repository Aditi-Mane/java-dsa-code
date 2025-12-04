package Arrays;

import java.util.Arrays;

public class SortZeroOneTwo {

    //Brute force: Sort the array

    //Better approach: TC - O(2n); SC - O(1)
    static int[] sort(int[] arr){
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i : arr) {
            if (i == 0) count0++;
            if (i == 1) count1++;
            if (i == 2) count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i] = 1;
        }
        for(int i=count0+count1;i<arr.length;i++){
            arr[i] = 2;
        }
        return arr;
    }
    
    //Optimal approach (Using the Dutch national flag algorithm) -> 3 pointer method: TC - O(n); SC - O(1)
    static int[] sort1(int[] arr){
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,1,1,2,2,1,0};
        int[] result = sort1(arr);
        System.out.println(Arrays.toString(result));
    }
}
