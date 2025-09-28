//Find the highest/lowest frequency element
package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighLowFrequency {
    static void getHigh(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        //find the frequency of all numbers
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //find the max frequency
        int max = 0;
        for(int maxFreq: map.values()){
            if(maxFreq > max){
                max = maxFreq;
            }
        }
        //print all keys that have max frequency
        System.out.print("Numbers with highest frequency (" + max + " times): ");
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println();
    }

    static void getLow(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num: arr){
            hash.put(num, hash.getOrDefault(num,0)+ 1);
        }
        //find the min frequency
        int min = Integer.MAX_VALUE;

        for (int freq : hash.values()) {
            if (freq < min) {
                min = freq;
            }
        }
        //print all keys that have max frequency
        System.out.print("Numbers with lowest frequency (" + min + " times): ");
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            if(entry.getValue() == min){
                System.out.print(entry.getKey()+" ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 4, 5, 2};
        getHigh(arr);
        getLow(arr);
    }
}
