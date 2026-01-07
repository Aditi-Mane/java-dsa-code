package Arrays;

import java.util.Arrays;

public class SetMatrixZeroes {

    //brute force: TC: O(n^3); SC: O(1)
    static int[][] setZeroes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    //mark row
                    for(int col=0;col<m;col++){
                        if(matrix[i][col] != 0){
                            matrix[i][col] = -1;
                        }
                    }
                    //mark col
                    for(int row=0;row<n;row++){
                        if(matrix[row][j] != 0){
                            matrix[row][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    //better approach: TC: O(m*n); SC: O(m+n)
    static int[][] setZeroesBetter(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rows = new int[n];
        int[] cols = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        //set zeroes
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i] == 1 || cols[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans = setZeroesBetter(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
}
