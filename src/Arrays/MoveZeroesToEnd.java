package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {

    //brute force approach: TC - O(2n); SC - O(n)
    static void moveZeroes2(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(num!=0){
                list.add(num);
            }
        }
        int i = 0;
        while(i<list.size()){
            arr[i] = list.get(i);
            i++;
        }
        while(i<arr.length){
            arr[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    //optimal approach: TC - 0(n); SC - O(1)
    static void moveZeroes(int[] arr){
        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 2, 3, 0};
        moveZeroes(arr);
        moveZeroes2(arr);
    }
}
