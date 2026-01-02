package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

    //brute force approach: TC: O(n^2); SC: O(1) -> No auxiliary space, output space excluded
    static void findLeaders(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean isLeader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    //optimal approach: C: O(n); SC: O(1)
    static void findLeadersOptimal(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length, max = arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        findLeadersOptimal(arr);
    }
}
