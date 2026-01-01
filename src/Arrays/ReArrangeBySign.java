package Arrays;

import java.util.Arrays;

public class ReArrangeBySign {

    //TC: O(n); SC: O(n)
    static int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[pos] = nums[i];
                pos = pos+2;
            } else {
                arr[neg] = nums[i];
                neg = neg+2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
