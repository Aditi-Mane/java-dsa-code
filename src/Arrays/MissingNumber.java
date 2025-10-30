package Arrays;

import java.util.HashMap;

public class MissingNumber {

    //brute force approach: TC - O(2n); SC - O(n)
    static int missingNum(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>(n);
        for (int j : arr) {
            map.put(j, 1);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }

    //better approach: TC - O(n); SC - O(1)
    static int missingNum2(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] != (i+1)){
                return i+1;
            }
        }
        return -1;
    }

    //sum approach: TC - O(n); SC - O(1)
    static int missingNum3(int[] arr){
        int ans = 0;
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for (int j : arr) {
            ans = ans + j;
        }
        return sum-ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int miss = missingNum3(arr);
        System.out.println("Missing number is "+ miss);
    }
}

