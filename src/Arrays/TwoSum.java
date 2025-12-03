package Arrays;

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
    public static void main(String[] args) {
        int[] arr = {23,12,2,3,32};
        int sum = 26;
        int[] nums = twoSum(arr, sum);
        System.out.println(nums[0]+" "+nums[1]);
    }
}
