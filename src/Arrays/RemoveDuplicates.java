package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    //brute force: by using a set: TC - 0(n log n); SC - O(n)
    static void remove(int[] arr){
        Set<Integer> set = new HashSet<>();

        //during insertion set takes O(n log n)
        for(int i: arr){
            set.add(i);
        }
        int index = 0;
        for(int num: set){
            index++;
        }
        System.out.println("The array without duplicates is "+set);
        System.out.println("The length of array without duplicates is: "+index);
    }

    //optimal approach (in-place): TC - O(n); SC: 0(1)
    static void remove2(int[] arr){
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.print("The array without duplicates is: ");
        for(int num=0;num < i+1;num++){
            System.out.print(arr[num]+" ");
        }
        System.out.println("\nThe length of array without duplicates is: "+(i+1));
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 6, 6, 1, 1, 9, 9};
        RemoveDuplicates.remove(arr);
        RemoveDuplicates.remove2(arr);
    }
}
