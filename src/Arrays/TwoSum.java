package Arrays;

import java.util.HashMap;

public class TwoSum {

    //brute force approach: O(n^2)
    static int[] twoSum(int[] arr, int sum){
        int arrSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                arrSum = arr[i] + arr[j];
                if(arrSum == sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    //better approach: 0(n)
    static int[] twoSum2(int[] arr, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int otherNum = target - arr[i];
            if(hash.containsKey(otherNum)){
                return new int[]{hash.get(otherNum), i};
            }
            hash.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {23,12,2,3,32};
        int target = 14;
        int[] nums = twoSum2(arr, target);
        System.out.println(nums[0]+" "+nums[1]);
    }
}
