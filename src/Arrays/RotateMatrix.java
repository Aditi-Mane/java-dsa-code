package Arrays;

import java.util.Arrays;

public class RotateMatrix {

    //brute force: TC: O(n^2); SC: O(n^2)
    static int[][] rotateMatrix(int[][] arr){
        int n = arr.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i] = arr[i][j];
            }
        }
        return ans;
    }

    //optimal approach: TC: O(n^2); SC: O(1)
    static int[][] rotateMatrixOptimal(int[][] arr){
        int m = arr.length;
        //transposing the matrix
        for(int i = 0; i<m; i++){
            for(int j = i+1; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reversing each row
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][m-1-j];
                arr[i][m-1-j] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = rotateMatrixOptimal(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
