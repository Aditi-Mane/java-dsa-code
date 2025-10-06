package Arrays;

public class LargestSmallestElement {

    //largest number in an array: O(n)
    static void largestNum(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.printf("Largest element in array is %d\n",max);
    }

    //smallest number in an array: 0(n)
    static void smallestNum(int[] arr){
        int min=arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("Smallest element in array is %d",min);
    }
    public static void main(String[] args) {
        int[] arr = {3,54,12,36,35,99};
        LargestSmallestElement.largestNum(arr);
        LargestSmallestElement.smallestNum(arr);
    }
}
