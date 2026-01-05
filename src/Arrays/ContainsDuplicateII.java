package Arrays;

import java.util.HashMap;

public class ContainsDuplicateII {

    //brute force approach: TC: O(n^2); SC: O(1)
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //optimal approach: TC: O(n); SC: O(n)
    static boolean containsNearbyDuplicate2(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hash.containsKey(nums[i])){
                if(Math.abs(hash.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            hash.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean ans = containsNearbyDuplicate2(nums, k);
        System.out.println(ans);
    }
}
