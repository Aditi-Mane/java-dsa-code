package Arrays;

import java.util.HashMap;

public class SubarraySum {

    //brute force: TC: O(n^2); SC: O(1)
    static int sum(int[] nums, int k){
        int n = nums.length, count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    //optimal approach (prefix sum + hashmap): TC: O(n); SC: O(n)
    static int sumOptimal(int[] nums, int k){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int currSum = 0, count = 0;
        hash.put(0,1);
        for(int num: nums){
            currSum = currSum + num;
            if(hash.containsKey(currSum - k)){
                count = count + hash.get(currSum-k);
            }
            hash.put(currSum, hash.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int ans = sumOptimal(nums, k);
        System.out.println(ans);
    }
}
