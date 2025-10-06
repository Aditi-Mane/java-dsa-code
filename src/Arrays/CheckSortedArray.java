package Arrays;

public class CheckSortedArray {
    static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,7};
        boolean check = CheckSortedArray.check(arr);
        if(check){
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }
}
