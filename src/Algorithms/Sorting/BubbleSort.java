package Algorithms.Sorting;

/*
 * Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm
 * in which each pair of adjacent elements is compared and the elements are swapped if they are not
 * in order. This algorithm is not suitable for large data sets as its average and worst case complexity
 * are of Ο(n^2) where n is the number of items.
 *
 * Worst and Average Case Time Complexity: O(n^2). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * */

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        /*
         * For counting no of passes around the array
         * No need to check last pass, as the elements are already sorted
         * */
        for (int i = 0; i < n - 1 - i; i++) {
            int flag = 0;
            /*
             * For comparing elements inside the array
             * n-1-i -> In Bubble sort the last elements are automatically in sorted order due to previous passes
             * so we can minus i from the iteration count as write as n-1-i
             * or we need not to check last values, no of last values are equal to i for each pass
             */
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            /*
             * If the flag value is 0 then no values are swapped in the iteration
             * i.e, the array is already in sorted order
             * To optimize the code
             * */
            if (flag == 0)
                break;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}

/*
 * Example1 :: Array  [16, 14, 5, 6, 8]
 *
 * Pass 1 -> i=0; j=0  [14, 16, 5, 6, 8]
 *           i=0; j=1  [14, 5, 16, 6, 8]
 *           i=0; j=2  [14, 5, 6, 16, 8]
 *           i=0; j=3  [14, 5, 6, 8, 16]
 *           Here automatically the maximum value come to last position,
 *           so no need to check the next iteration i.e, j=4
 *
 * Pass 2 -> i=1; j=0  [5, 14, 6, 8, 16]
 *           i=1; j=1  [5, 6, 14, 8, 16]
 *           i=1; j=2  [5, 6, 8, 14, 16]
 *           Here automatically the maximum value come to last position,
 *           so no need to check the next iteration i.e, j=3
 *
 * Pass 3 -> i=2; j=0  [5, 6, 8, 14, 16]
 *           i=2; j=1  [5, 6, 8, 14, 16]
 *           Here automatically the maximum value come to last position,
 *           so no need to check the next iteration i.e, j=3
 * */
