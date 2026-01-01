package Arrays;

public class StockBuyAndSell {

    //brute force approach: TC: O(n^2); SC: O(1)
    static int buyAndSell(int[] arr){
        int currProfit = 0, maxProfit = 0;
        for(int i=arr.length-1;i>=0;i--){
            int min = arr[0];
            for(int j=1;j<=i-1;j++){
                if(arr[j]<min){
                    min = arr[j];
                }
            }
            maxProfit = Math.max(currProfit, arr[i] - min);
        }
        return maxProfit;
    }

    //optimal approach: TC: O(n); SC: O(1)
    static int buyAndSellOptimal(int[] arr){
        int minPrice = arr[0], maxProfit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i]-minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = buyAndSellOptimal(arr);
        System.out.println(ans);
    }
}
