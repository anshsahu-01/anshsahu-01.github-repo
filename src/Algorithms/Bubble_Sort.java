package Algorithms;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSwap = false;

        for (int i = 0; i < n-1-i; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap){
                break;
            }
        }
    }
}
