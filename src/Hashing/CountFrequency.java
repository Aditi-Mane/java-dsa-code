//Count frequency of each digit in an array.
package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    static void frequency(){
        int[] arr = {1, 2, 3, 1, 2, 1, 4, 5, 2};
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: hash.entrySet()){
            System.out.println("For number "+entry.getKey()+" the frequency count is "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        CountFrequency.frequency();
    }
}
