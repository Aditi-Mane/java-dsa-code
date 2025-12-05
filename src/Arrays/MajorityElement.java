package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Brute force approach: TC - O(n^2); SC - O(1)
    static int major(int[] arr){
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }

    //Better approach: TC - O(n); SC - O(n)
    static int major1(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i: arr){
            if(hash.containsKey(i)){
                hash.put(i, hash.get(i)+1);
            } else {
                hash.put(i,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: hash.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    //Optimal approach (Boyer–Moore Majority Vote Algorithm):
    static int major2(int[] arr){
        int element = 0,count = 0,n=arr.length;
        for (int i : arr) {
            if (count == 0) {
                count = 1;
                element = i;
            } else if (element == i) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int j : arr) {
            if (j == element) {
                count1++;
            }
        }
        if(count1>n/2){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,1,2,2};
        int count = major2(arr);
        System.out.println(count);
    }
}
