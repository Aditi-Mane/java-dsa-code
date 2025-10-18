package Arrays;

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
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;
        int length = sub2(arr, k);
        System.out.println("The length of the longest sub-array with k sum is "+length);
    }
}
