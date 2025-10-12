package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    static void intersection(int[] a, int[] b){

        //brute force approach: TC - O(n1*n2); SC - O(n2)
        int n1=a.length;
        int n2=b.length;
        int[] visited = new int[n2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i] == b[j] && visited[j] == 0){
                    list.add(a[i]);
                    visited[j] = 1;
                    break;
                }
                if(b[j]>a[i]) break;
            }
        }
        System.out.println(list);
    }

    //optimized approach: TC - O(n1+n2); SC - O(1)
    static void intersection2(int[] arr, int[] arr2){
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<arr.length && j<arr2.length){
            if(arr[i] < arr2[j]){
                i++;
            } else if(arr[i] == arr2[j]){
                list.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] > arr2[j]) {
                j++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,5};
        int[] b = {1,2,3,3,6,7,8,9};
        intersection2(a, b);
    }
}
