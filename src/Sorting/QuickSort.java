package Sorting;

//Best & Average TC: O(n log n), WC: 0(n^2) ; SC: O(1)/O(log n)
public class QuickSort {
    static int findPIndex(int[] arr, int low, int high) {
        int pivot = arr[low];  //take first element as pivot
        int i = low;
        int j = high;
        while (i < j) {
            //move i to right while elements <= pivot
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }
            //move j to left while elements > pivot
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            //swap if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //place pivot at correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; //return pivot index
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = findPIndex(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Quick sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
