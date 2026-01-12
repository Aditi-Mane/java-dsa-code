package Arrays;

import java.util.ArrayList;

// TC: O(n*m), SC: O(n*m)
public class SpiralMatrix {
    static void spiral(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, left = 0, right = m-1, bottom = n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if (top <= bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}
