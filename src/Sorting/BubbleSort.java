package Sorting;

//Best TC: 0(N), Worst & Average TC: O(N^2)
public class BubbleSort {
    static void bubble(int[] arr){
        int n = arr.length;
        int didSwap = 0;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        System.out.println("Bubble sorted array is: ");
        for( int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        BubbleSort.bubble(arr);
    }
}
