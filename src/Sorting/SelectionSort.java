package Sorting;

//Best, Worst & Average TC: O(N^2)
public class SelectionSort {
    static void selection(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Selection sorted array is: ");
        for( int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        SelectionSort.selection(arr);
    }
}
