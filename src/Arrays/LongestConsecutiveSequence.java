package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    //brute force approach: TC: O(n^2); SC: O(1)
    static int longestSequence(int[] nums){
        int n = nums.length, maxCount = 1;
        for(int i=0;i<n;i++){
            int x = nums[i], count = 1;
            while(linearSearch(nums, x + 1)){
                x = x+1;
                count = count+1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    static boolean linearSearch(int[] nums, int x){
        for(int i: nums){
            if(i == x){
                return true;
            }
        }
        return false;
    }

    //better approach: TC: O(n log n); SC: O(1)
    static int longestSequenceBetter(int[] nums){
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        int maxCount = 1, currCount = 0, lastSmallest = Integer.MIN_VALUE;
        for (int num : nums) {
            if ((num - 1) == lastSmallest) {
                currCount = currCount + 1;
                lastSmallest = num;
            } else if (num != lastSmallest) {
                currCount = 1;
                lastSmallest = num;
            }
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }

    //optimal approach: TC: O(n); SC: O(n)
    static int longestSequenceOptimal(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxCount = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int currNumber = num;
                int currCount = 1;
                while(set.contains(currNumber + 1)){
                    currNumber++;
                    currCount++;
                }
                maxCount = Math.max(maxCount, currCount);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        int ans = longestSequenceOptimal(nums);
        System.out.println(ans);
    }
}
