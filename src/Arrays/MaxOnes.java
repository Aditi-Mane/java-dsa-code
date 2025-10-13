package Arrays;

public class MaxOnes {
    static int maxOnes(int[] arr){

        //first approach: TC - O(n); SC - O(1)
        int count=0, maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                if(count>maxCount){
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1};
        int max = maxOnes(arr);
        System.out.println("The maximum number of consecutive ones is: "+max);
    }
}
