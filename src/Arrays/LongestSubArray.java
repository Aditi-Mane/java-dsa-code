package Arrays;

import java.util.HashMap;

public class LongestSubArray {

    //brute force approach: TC - O(n^2); SC - O(1)
    static int sub2(int[] arr, int k){
        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum == k){
                    maxLength = Math.max(j - i + 1, maxLength);
                }
            }
        }
        return maxLength;
    }

    //sliding window approach: TC - O(n); SC - 0(1)
    static int sub(int[] arr, int k){
        int start = 0, maxLength = 0, sum = 0;
        for(int end = 0; end<arr.length;end++){
            sum = sum + arr[end];
            while(sum > k){
                sum = sum - arr[start];
                start++;
            }
            if(sum == k){
                int currLength = end - start + 1;
                maxLength = Math.max(currLength, maxLength);
            }
        }
        return maxLength;
    }

    //prefix sum + hashmap approach ( for +ve & -ve ) : TC - O(n); SC - O(n)
    static int sub3(int[] arr, int k) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray starts from index 0
            if (sum == k) {
                maxLength = i + 1;
            }

            // Case 2: if (sum - k) exists as a key then currLength is i - sum-k's index
            if (prefixMap.containsKey(sum - k)) {
                int prevIndex = prefixMap.get(sum - k);
                int currLength = i - prevIndex;
                maxLength = Math.max(maxLength, currLength);
            }

            // Store sum in map only if not already present (we want the first occurrence)
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {10, -10, 20, -5, 5, -15, 10};
        int k = 10;
        int length = sub3(arr, k);
        System.out.println("The length of the longest sub-array with k sum is "+length);
    }
}
