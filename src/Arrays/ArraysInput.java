package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting input in 1d array
        int[] arr = new int[4];
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        //method 1 to print
        System.out.println(Arrays.toString(arr));

        //method 2 to print
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //method 3 to print
        for(int num: arr){
            System.out.print(num+" ");
        }

        //getting input in 2d arrays
        int[][] arr2d = new int[3][3];

        for(int row = 0; row <= arr2d.length-1; row++){
            for(int col = 0; col<= arr2d[row].length-1; col++){
                arr2d[row][col] = sc.nextInt();
            }
        }

        //method 1
        for(int row = 0; row <= arr2d.length-1; row++){
            for(int col = 0; col<= arr2d[row].length-1; col++){
                System.out.print(arr2d[row][col]);
            }
            System.out.println();
        }

        //method 2
        for(int[] a: arr2d){
            System.out.println(Arrays.toString(a));
        }

        //method 3
        for(int row = 0;row<=arr2d.length-1;row++){
            System.out.println(Arrays.toString(arr2d[row]));
        }

        //custom 2d array input
        int[][] array = {
                {1, 3, 2, 1},
                {6, 8, 4},
                {4, 5}
        };

        for(int row=0;row<=array.length-1;row++){
            for(int col=0;col<=array[row].length-1;col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
