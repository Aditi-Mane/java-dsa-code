package Arrays;

public class SecondLargestSmallestElement {
    //second-largest number in an array

    //Brute force approach: O(2n)
    static void secondLarge(int[] arr){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.printf("Second Largest number in array is %d\n", secondLargest);
    }

    //Optimized approach: O(n)
    static void secondLarge2(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.printf("Second Largest number in array is %d\n", secondLargest);
    }

    //second-smallest number in an array: 0(n)
    static void secondSmall(int[] arr){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if(arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        System.out.printf("Second smallest number in array is %d\n", secondMin);
    }

    public static void main(String[] args) {
        int[] arr = {3,54,12,36,35,99};
        SecondLargestSmallestElement.secondLarge(arr);
        SecondLargestSmallestElement.secondLarge2(arr);
        SecondLargestSmallestElement.secondSmall(arr);
    }
}
