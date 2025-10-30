package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionOfArrays {

    //brute force approach: TC - O(n+m);SC - O(n+m)
    static void union(int[] arr, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        for(int j: arr2){
            set.add(j);
        }
        List<Integer> list = new ArrayList<>(set);

        int[] union = new int[list.size()];
        for(int i=0;i<union.length;i++){
            union[i] = list.get(i);
        }
        System.out.println(Arrays.toString(union));
    }

    //optimized approach: TC - O(n+m); SC - O(n+m)
    static int[] union2(int[] arr, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr[i]){
                    list.add(arr[i]);
                }
                i++;
            } else if(arr[i]==arr2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr[i]){
                    list.add(arr[i]);
                }
                i++;
                j++;
            } else if(arr[i]>arr2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr[i]){
                list.add(arr[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        int[] union = new int[list.size()];
        for(int k=0; k<union.length; k++){
            union[k] = list.get(k);
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5};
        int[] arr2 = {1,2,3,4,6,7,7,8,8,9};
        union(arr, arr2);
        int[] union = union2(arr, arr2);
        System.out.println(Arrays.toString(union));
    }
}

