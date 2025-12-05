package Arrays;

public class KadaneAlgorithm {

    //Brute force method: TC - O(n^2); SC - O(1)
    static int subArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = subArray(arr);
        System.out.println(max);
    }
}
