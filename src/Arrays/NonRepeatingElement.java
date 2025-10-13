package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {

    //first approach: using hashmap -> TC - O(n); SC - O(n)
    static int nonRepeat(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i: arr){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            } else {
                hash.put(i,1);
            }
        }
        int nonRepeatNum = 0;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getValue()==1){
                nonRepeatNum = entry.getKey();
            }
        }
        return nonRepeatNum;
    }

    //second approach: using xor -> TC - O(n); SC - O(1)
    static int nonRepeat2(int[] arr){
        int xor = 0;
        for(int i: arr){
            xor = xor^i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,6};
        int num = nonRepeat2(arr);
        System.out.println("The non repeating number is "+num);
    }

}
