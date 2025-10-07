package Arrays;

import java.util.Arrays;

public class LeftRotateArray {

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
    static int[] bykPlaces(int[] arr){
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] newArr = byOne(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
