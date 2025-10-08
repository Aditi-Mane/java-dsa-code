package Arrays;

//TC: O(n)
public class LinearSearch {
    static int search(int[] arr, int term){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == term){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,23,45,32,17,62,12};
        int term = 45;
        int index = search(arr, term);
        System.out.println("The term is at "+ index);
    }
}
