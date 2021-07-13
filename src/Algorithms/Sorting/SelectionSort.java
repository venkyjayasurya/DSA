package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            int min = i;                    //Initialize min is a[0]
            for(int j=i+1; j<n; j++){       //Find the minimum value in unsorted list
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){                   //Swap the values arr[i] , arr[min]
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements");
        int size = in.nextInt();
        int[] data = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            data[i] = in.nextInt();
        }
//        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
